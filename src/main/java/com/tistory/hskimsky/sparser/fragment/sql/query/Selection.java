package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * selection
 * <p>
 * ex) column_name = 'condition_pattern'
 *
 * @author Haneul, Kim
 */
public class Selection extends SQLFragment {

    private String left;

    private String operator;

    private String right;

    public Selection(String sqlFragment) {
        super(sqlFragment);

        this.left = "";
        this.operator = "";
        this.right = "";
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(And.class);
        this.nextPossibles.add(Or.class);
        this.nextPossibles.add(Having.class);
        this.nextPossibles.add(Selection.class);// update table_name set selection, selection ...
        this.nextPossibles.add(Where.class);// update table_name set selection where ...

        this.nextPossibles.add(Semicolon.class);
    }
}
