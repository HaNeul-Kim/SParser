package com.tistory.hskimsky.sparser.fragment.sql.postgresql.query;

import com.tistory.hskimsky.sparser.fragment.exception.SParseException;
import com.tistory.hskimsky.sparser.fragment.sql.query.TableName;

/**
 * postrgresql table name
 *
 * @author Haneul, Kim
 */
public class PostgreSQLTableName extends TableName {

    private String databaseName;

    private String schemaName;

    private String tableName;

    public PostgreSQLTableName(String sqlFragment) throws SParseException {
        super(sqlFragment);

        String[] tableTokens = sqlFragment.split("\\.", Integer.MAX_VALUE);

        switch (tableTokens.length) {
            case 1:
                this.databaseName = "";
                this.schemaName = "public";
                this.tableName = tableTokens[0];
                break;
            case 2:
                this.databaseName = "";
                this.schemaName = tableTokens[0];
                this.tableName = tableTokens[1];
                break;
            case 3:
                this.databaseName = tableTokens[0];
                this.schemaName = tableTokens[1];
                this.tableName = tableTokens[2];
                break;
            default:
                throw new SParseException(PostgreSQLTableName.class.getSimpleName() + " parse error. tableTokens.length is " + tableTokens.length);
        }
    }
}
