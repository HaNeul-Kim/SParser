package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.Query;
import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * insert
 *
 * @author Haneul, Kim
 */
public class Insert extends SQLFragment implements Query {

    private String keyword;

    public Insert(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Into.class);
    }

    @Override
    public void addKeyword(String keyword) {
        this.keyword = keyword;
    }
}
