package com.tistory.hskimsky.sparser;

import com.tistory.hskimsky.sparser.fragment.sql.SQLKeywords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * SParser starter class
 *
 * @author Haneul, Kim
 */
public class SParser {

    public static void parse(String sqlText) {
        Arrays.asList(SQLKeywords.values()).forEach(System.out::println);

        String[] tokens = sqlText.split("\\s", Integer.MAX_VALUE);
        List<String> tokenList = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            tokenList.add(token);
        }
        System.out.println(tokenList);
    }

    public static void main(String[] args) {
        SParser.parse("select * from game.lotto;");
    }
}
