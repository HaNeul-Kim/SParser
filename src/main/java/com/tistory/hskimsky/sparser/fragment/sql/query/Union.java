package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * union
 *
 * @author Haneul, Kim
 */
public class Union extends SQLFragment {

    public Union(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(All.class);
        this.nextPossibles.add(Distinct.class);
        this.nextPossibles.add(Select.class);
    }
}
