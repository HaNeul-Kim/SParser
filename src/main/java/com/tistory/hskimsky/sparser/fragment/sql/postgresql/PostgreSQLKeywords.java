package com.tistory.hskimsky.sparser.fragment.sql.postgresql;

import com.tistory.hskimsky.sparser.Keywords;

/**
 * postgresql keywords
 *
 * @author Haneul, Kim
 */
public enum PostgreSQLKeywords implements Keywords {
    offset("offset"),
    only("only");

    private String keyword;

    PostgreSQLKeywords(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return this.keyword;
    }
}
