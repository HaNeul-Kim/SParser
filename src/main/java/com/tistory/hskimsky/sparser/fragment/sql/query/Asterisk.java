package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * asterisk
 *
 * @author Haneul, Kim
 */
public class Asterisk extends SQLFragment {

    public Asterisk(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Projection.class);
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(From.class);
    }
}
