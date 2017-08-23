package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * column name
 *
 * @author Haneul, Kim
 */
public class ColumnName extends SQLFragment {

    private String columnName;

    public ColumnName(String sqlFragment) {
        super(sqlFragment);
        this.columnName = sqlFragment;
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Alias.class);
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(From.class);
        this.nextPossibles.add(Between.class);
        this.nextPossibles.add(In.class);

        this.nextPossibles.add(Semicolon.class);
    }
}

