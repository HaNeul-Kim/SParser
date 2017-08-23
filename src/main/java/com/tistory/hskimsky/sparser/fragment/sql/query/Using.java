package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * using
 *
 * @author Haneul, Kim
 */
public class Using extends SQLFragment {

    public Using(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
    }
}
