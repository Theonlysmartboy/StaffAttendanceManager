package com.otema.staffattendancemanager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Maseno on 5/29/2017.
 */

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase Db, int OldVersion, int NewVersion) {

    }
}
