package com.example.lottoscratch;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class NumberDbHelper extends SQLiteOpenHelper {
    private static NumberDbHelper sInstance;

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "Number.db";

    private static final String SQL_CREATE_ENTRIES;

    static {
        SQL_CREATE_ENTRIES = String.format("CREATE TABLE %s (%s INTEGER PRIMARY KEY AUTOINCREMENT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT, %s TEXT)",
                NumberRecord.NumberEntry.TABLE_NAME,
                NumberRecord.NumberEntry._ID,
                NumberRecord.NumberEntry.TIME_STAMP,
                NumberRecord.NumberEntry.FIRST_NUMBER,
                NumberRecord.NumberEntry.SECOND_NUMBER,
                NumberRecord.NumberEntry.THIRD_NUMBER,
                NumberRecord.NumberEntry.FOURTH_NUMBER,
                NumberRecord.NumberEntry.FIFTH_NUMBER,
                NumberRecord.NumberEntry.SIXTH_NUMBER,
                NumberRecord.NumberEntry.LIKE_NUMBER
        );
    }

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + NumberRecord.NumberEntry.TABLE_NAME;




    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public static synchronized NumberDbHelper getInstance(Context context){
        if(sInstance==null)
            sInstance = new NumberDbHelper(context.getApplicationContext());

        return sInstance;

    }

    private NumberDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
}
