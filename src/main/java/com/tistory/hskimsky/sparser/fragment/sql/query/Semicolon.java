package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * semicolon
 *
 * @author Haneul, Kim
 */
public class Semicolon extends SQLFragment {

    public Semicolon(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        // none
    }
}
