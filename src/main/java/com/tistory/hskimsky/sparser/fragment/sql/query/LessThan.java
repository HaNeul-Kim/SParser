package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * less than
 *
 * @author Haneul, Kim
 */
public class LessThan extends SQLFragment {

    public LessThan(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ConditionPattern.class);
    }
}
