package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * greater than
 *
 * @author Haneul, Kim
 */
public class GreaterThan extends SQLFragment {

    public GreaterThan(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(ConditionPattern.class);
    }
}
