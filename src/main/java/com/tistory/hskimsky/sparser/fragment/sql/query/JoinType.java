package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * join type
 *
 * @author Haneul, Kim
 */
public class JoinType extends SQLFragment {

    private String joinType;

    public JoinType(String sqlFragment) {
        super(sqlFragment);
        this.joinType = sqlFragment;
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Join.class);
    }
}
