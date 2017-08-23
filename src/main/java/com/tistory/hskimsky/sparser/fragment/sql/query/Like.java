package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * like
 *
 * @author Haneul, Kim
 */
public class Like extends SQLFragment {

    public Like(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(LikePattern.class);
    }
}
