package com.example.tp_2_produit;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB_Sql extends SQLiteOpenHelper {

    public static final String DbName = "Produit.db";
    public DB_Sql(Context context) {
        super(context, DbName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table Produit (id integer primary Key )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
