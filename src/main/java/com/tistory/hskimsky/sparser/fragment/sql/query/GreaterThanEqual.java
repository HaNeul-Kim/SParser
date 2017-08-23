package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * greater than equal
 *
 * @author Haneul, Kim
 */
public class GreaterThanEqual extends SQLFragment {

    public GreaterThanEqual(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ConditionPattern.class);
    }
}
