package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * values
 *
 * @author Haneul, Kim
 */
public class Values extends SQLFragment {

    public Values(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
    }
}
