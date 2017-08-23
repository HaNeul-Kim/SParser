package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * between
 *
 * @author Haneul, Kim
 */
public class Between extends SQLFragment {

    private String min;

    private String max;

    public Between(String sqlFragment) {
        super(sqlFragment);

        this.min = "";
        this.max = "";
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
    }
}
