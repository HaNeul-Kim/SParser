package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * into
 *
 * @author Haneul, Kim
 */
public class Into extends SQLFragment {

    public Into(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(TableName.class);
    }
}
