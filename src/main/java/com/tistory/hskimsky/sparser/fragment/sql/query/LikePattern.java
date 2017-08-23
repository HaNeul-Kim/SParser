package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * like pattern
 *
 * @author Haneul, Kim
 */
public class LikePattern extends SQLFragment {

    public LikePattern(String sqlFragment) {
        super(sqlFragment);
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(And.class);
        this.nextPossibles.add(Or.class);
        this.nextPossibles.add(GroupBy.class);
        this.nextPossibles.add(OrderBy.class);

        this.nextPossibles.add(Semicolon.class);
    }
}
