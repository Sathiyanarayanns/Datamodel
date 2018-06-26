package com.example.srirama.datamodel;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

/**
 * Created by srirama on 6/17/2018.
 */

public class Sqlite extends SQLiteOpenHelper {


    private static final int DATABASE_VERISON=1;
    private static final String database="username";

    public Sqlite(Context context) {
        super(context, "sathiya", null, 1);
    }


    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE sqldb(username Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long insertNote(String username){
            SQLiteDatabase db=this.getWritableDatabase();
        ContentValues val=new ContentValues();
        val.put("username",username);
        long id=db.insert("username",null,val);
        db.close();
        return id;
    }
}
