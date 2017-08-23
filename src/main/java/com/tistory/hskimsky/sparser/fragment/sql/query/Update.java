package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.Query;
import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * update
 *
 * @author Haneul, Kim
 */
public class Update extends SQLFragment implements Query {

    private String keyword;

    public Update(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(TableName.class);
    }

    @Override
    public void addKeyword(String keyword) {
        this.keyword = keyword;
    }
}
