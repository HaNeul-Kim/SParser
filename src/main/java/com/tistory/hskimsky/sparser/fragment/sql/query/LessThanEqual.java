package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * less than equal
 *
 * @author Haneul, Kim
 */
public class LessThanEqual extends SQLFragment {

    public LessThanEqual(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ConditionPattern.class);
    }
}
