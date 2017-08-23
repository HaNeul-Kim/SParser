package com.tistory.hskimsky.sparser.fragment.sql;

import com.tistory.hskimsky.sparser.Keywords;

/**
 * sql keywords
 *
 * @author Haneul, Kim
 */
public enum SQLKeywords implements Keywords {

    // select
    select("select", true), all("all", false), distinct("distinct", false), as("as", false),

    // from
    from("from", true),

    // join
    inner("inner", false), left("left", false), right("right", false), full("full", false), cross("cross", false),
    outer("outer", false), join("join", true), using("using", true),

    // where
    where("where", true), and("and", true), or("or", true), between("between", false),

    // group by
    group("group", false), by("by", false),

    // having
    having("having", true),

    // order by
    order("order", false),

    // limit
    limit("limit", false),

    // insert
    insert("insert", false), into("into", false), values("values", true),

    // update
    update("update", false), set("set", false),

    // delete
    delete("delete", false);

    private String keyword;

    private boolean possibleOpenParentheses;

    SQLKeywords(String keyword, boolean possibleOpenParentheses) {
        this.keyword = keyword;
        this.possibleOpenParentheses = possibleOpenParentheses;
    }

    public String getKeyword() {
        return keyword;
    }

    public boolean isPossibleOpenParentheses() {
        return possibleOpenParentheses;
    }
}
