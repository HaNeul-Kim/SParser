package com.tistory.hskimsky.sparser.fragment.sql;

import com.tistory.hskimsky.sparser.fragment.Fragment;

import java.util.ArrayList;
import java.util.List;

/**
 * sql fragment
 *
 * @author Haneul, Kim
 */
public abstract class SQLFragment implements Fragment {

    protected List<Class<? extends SQLFragment>> nextPossibles;

    public SQLFragment(String sqlFragment) {
        this.nextPossibles = new ArrayList<>();
    }

    public abstract void addNextPossible();
}
