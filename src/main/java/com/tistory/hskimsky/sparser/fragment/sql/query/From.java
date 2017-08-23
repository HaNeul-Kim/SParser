package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * from
 *
 * @author Haneul, Kim
 */
public class From extends SQLFragment {

    private String tableName;

    public From(String sqlFragment) {
        super(sqlFragment);
        this.tableName = sqlFragment;
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(TableName.class);
    }
}
