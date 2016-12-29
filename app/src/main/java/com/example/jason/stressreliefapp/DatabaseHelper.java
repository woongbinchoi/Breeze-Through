package com.example.jason.stressreliefapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Jason on 2016-12-27.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String Database_Name = "Stress.db";
    public static final String Table_Name = "stress_table";
    public static final String ID = "ID";
    public static final String Title = "Title";
    public static final String SubTitle = "SubTitle";
    public static final String Type = "Type";



    public DatabaseHelper(Context context) {
        super(context, Database_Name, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + Table_Name +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,TITLE TEXT, SUBTITLE TEXT, TYPE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +Table_Name);
        onCreate(db);
    }
}
