package com.example.sql;

import android.provider.BaseColumns;

public final class Contractor { // holds all the constants
    private Contractor() {}
    public static class TableContents implements BaseColumns {
        public static final String TABLE_NAME = "demo";
        public static final String COLUMN_NAME_A = "first_name";
        public static final String COLUMN_NAME_B = "second_name";

    }
    /*
        CREATE TABLE <NAME> (
        ID INT PRIMARY KEY ,
          COLUMN_NAME_A TEXT,
          COLUMN_NAME_B TEXT,
                 );
         */
    public static final String SQL_CREATE_ENTRIES = "CREATE TABLE " + TableContents.TABLE_NAME + " (" + TableContents._ID + " INTEGER PRIMARY KEY," +  TableContents.COLUMN_NAME_A + " TEXT," + TableContents.COLUMN_NAME_B + " TEXT)";
    public static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS " + TableContents.TABLE_NAME;
}
