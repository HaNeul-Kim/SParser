package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * group by
 *
 * @author Haneul, Kim
 */
public class GroupBy extends SQLFragment {

    public GroupBy(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(Projection.class);
    }
}
