package com.tistory.hskimsky.sparser.fragment.sql;

import com.tistory.hskimsky.sparser.Keywords;

/**
 * sql data types
 *
 * @author Haneul, Kim
 */
public enum SQLDataTypes implements Keywords {

    character("character"), varchar("varchar"), varchar2("varchar2"),

    text("text"), character_varying("character varying"), string("string"),

    _boolean("boolean"), _short("short"),

    _int("int"), int4("int4"), int8("int8"), int16("int16"), int32("int32"),

    _double("double"), double_precision("double precision"), _float("float"), float8("float8"), _long("long"),

    // array
    character_array("character[]"), varchar_array("varchar[]"), varchar2_array("varchar2[]"),

    text_array("text[]"), character_varying_array("character varying[]"), string_array("string[]"),

    _boolean_array("boolean[]"), _short_array("short[]"),

    _int_array("int[]"), int4_array("int4[]"), int8_array("int8[]"), int16_array("int16[]"), int32_array("int32[]"),

    _double_array("double[]"), double_precision_array("double precision[]"),

    _float_array("float[]"), float8_array("float8[]"), _long_array("long[]");

    private String keyword;

    private boolean requiredParameters;

    private String parameterCountCondition;

    private int parameterCount;

    SQLDataTypes(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }
}
