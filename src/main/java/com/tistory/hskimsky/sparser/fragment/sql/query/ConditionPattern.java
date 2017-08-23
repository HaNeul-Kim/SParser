package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * condition pattern
 *
 * @author Haneul, Kim
 */
public class ConditionPattern extends SQLFragment {

    public ConditionPattern(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(And.class);
        this.nextPossibles.add(Or.class);
        this.nextPossibles.add(Selection.class);// update table_name set selection, selection ...

        this.nextPossibles.add(Semicolon.class);
    }
}
