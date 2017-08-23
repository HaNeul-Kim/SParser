package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * alias
 *
 * @author Haneul, Kim
 */
public class Alias extends SQLFragment {

    public Alias(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(TableName.class);
    }
}
