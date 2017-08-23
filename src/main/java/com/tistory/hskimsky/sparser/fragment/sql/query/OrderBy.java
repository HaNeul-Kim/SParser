package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * order by
 *
 * @author Haneul, Kim
 */
public class OrderBy extends SQLFragment {

    public OrderBy(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);

        this.nextPossibles.add(Semicolon.class);
    }
}
