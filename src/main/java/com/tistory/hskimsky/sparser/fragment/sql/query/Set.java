package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * update table_name set
 *
 * @author Haneul, Kim
 */
public class Set extends SQLFragment {

    public Set(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Selection.class);

        this.nextPossibles.add(Semicolon.class);
    }
}
