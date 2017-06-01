package com.example.android.waitlist.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.waitlist.data.WaitlistContract.WaitlistEntry;


public class WaitlistDbHelper extends SQLiteOpenHelper {

    static final String DATABASE_NAME = "waitlist.db";
    static final int DATABASE_VERSION = 1;

    public WaitlistDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_WAITLIST_TABLE  = "CREATE TABLE " + WaitlistEntry.TABLE_NAME + " ( " +
                WaitlistEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + WaitlistEntry
                .COLUMN_GUEST_NAME + " TEXT, " + WaitlistEntry.COLUMN_PARTY_SIZE + " INTEGER, " +
                WaitlistEntry.COLUMN_TIMESTAMP + " CURRENT_TIMESTAMP)";

        sqLiteDatabase.execSQL(SQL_CREATE_WAITLIST_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String SQL_DELETE_WAITLIST_TABLE = "DROP TABLE IF EXISTS " + WaitlistEntry.TABLE_NAME;
        sqLiteDatabase.execSQL(SQL_DELETE_WAITLIST_TABLE);
        onCreate(sqLiteDatabase);
    }


}