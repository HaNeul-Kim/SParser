package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * projection of select query
 *
 * @author Haneul, Kim
 */
public class Projection extends SQLFragment {

    public Projection(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Alias.class);
        this.nextPossibles.add(ColumnName.class);

        this.nextPossibles.add(Semicolon.class);
    }
}
