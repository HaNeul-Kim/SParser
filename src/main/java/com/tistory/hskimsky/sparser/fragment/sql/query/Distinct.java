package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * distinct
 *
 * @author Haneul, Kim
 */
public class Distinct extends SQLFragment {

    public Distinct(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(Projection.class);
        this.nextPossibles.add(Select.class);// union distinct
    }
}
