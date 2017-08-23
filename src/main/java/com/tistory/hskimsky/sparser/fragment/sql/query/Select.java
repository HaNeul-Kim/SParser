package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.Query;
import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * select query
 *
 * @author Haneul, Kim
 */
public class Select extends SQLFragment implements Query {

    private String keyword;

    private int depth;

    public Select(String sql) {
        super(sql);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(All.class);
        this.nextPossibles.add(Distinct.class);
        this.nextPossibles.add(Projection.class);
        this.nextPossibles.add(ColumnName.class);
        this.nextPossibles.add(Function.class);
        this.nextPossibles.add(Asterisk.class);
        this.nextPossibles.add(Select.class);
    }

    @Override
    public void addKeyword(String keyword) {
        this.keyword = keyword;
    }
}
