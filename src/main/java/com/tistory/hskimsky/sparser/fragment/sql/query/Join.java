package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * join
 *
 * @author Haneul, Kim
 */
public class Join extends SQLFragment {

    public Join(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(TableName.class);
        this.nextPossibles.add(Select.class);
    }
}
