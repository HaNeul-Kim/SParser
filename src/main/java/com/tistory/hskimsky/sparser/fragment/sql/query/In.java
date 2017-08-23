package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * in
 *
 * @author Haneul, Kim
 */
public class In extends SQLFragment {

    public In(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Select.class);
    }
}
