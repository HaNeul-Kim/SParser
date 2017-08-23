package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * or
 *
 * @author Haneul, Kim
 */
public class Or extends SQLFragment {

    public Or(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Selection.class);
    }
}
