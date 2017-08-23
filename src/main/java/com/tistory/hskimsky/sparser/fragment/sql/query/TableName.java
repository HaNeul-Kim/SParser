package com.tistory.hskimsky.sparser.fragment.sql.query;

import com.tistory.hskimsky.sparser.fragment.sql.SQLFragment;

/**
 * table name
 *
 * @author Haneul, Kim
 */
public class TableName extends SQLFragment {

    private String tableName;

    public TableName(String sqlFragment) {
        super(sqlFragment);
        this.tableName = sqlFragment;
    }

    @Override
    public void addNextPossible() {
        this.nextPossibles.add(Alias.class);
        this.nextPossibles.add(TableName.class);
        this.nextPossibles.add(Using.class);
        this.nextPossibles.add(Where.class);
        this.nextPossibles.add(Select.class);
        this.nextPossibles.add(GroupBy.class);
        this.nextPossibles.add(OrderBy.class);
        this.nextPossibles.add(Values.class);
        this.nextPossibles.add(Set.class);// update table_name set

        this.nextPossibles.add(Semicolon.class);
    }
}
