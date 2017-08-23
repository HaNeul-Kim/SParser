package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * function
 *
 * @author Haneul, Kim
 */
public class Function extends SQLFragment {

    public Function(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Alias.class);
        this.nextPossibles.add(ColumnName.class);

        this.nextPossibles.add(Semicolon.class);
    }
}
