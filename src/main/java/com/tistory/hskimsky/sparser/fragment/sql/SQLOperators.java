package com.tistory.hskimsky.sparser.fragment.sql;

import com.tistory.hskimsky.sparser.Keywords;

/**
 * sql operators
 *
 * @author Haneul, Kim
 */
public enum SQLOperators implements Keywords {

    equal("="), not_equal1("!="), not_equa2("<>"), greater_than(">"), greater_than_equal(">="), less_than("<"), less_than_equal("<=");

    private String keyword;

    private boolean requiredParameters;

    private String parameterCountCondition;

    private int parameterCount;

    SQLOperators(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }
}
