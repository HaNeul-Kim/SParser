package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * equal
 *
 * @author Haneul, Kim
 */
public class Equal extends SQLFragment {

    public Equal(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ConditionPattern.class);
    }
}
