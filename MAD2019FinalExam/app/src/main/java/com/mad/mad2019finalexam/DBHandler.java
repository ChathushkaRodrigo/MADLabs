package com.mad.mad2019finalexam;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="UsersInfo.db";

    public DBHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_ENTRIES =
                "CREATE TABLES" + DatabaseMaster.Users.Table_name+"("+
                        DatabaseMaster.Users.Username+"INTEGER PRIMARY KEY"+
                        DatabaseMaster.Users.UserType+"TEXT"+
                        DatabaseMaster.Users.Password+"TEXT)";
        sqLiteDatabase.execSQL(SQL_CREATE_ENTRIES);

        String SQL_CREATE_MOVIE =

          "CREATE TABLES"  +DatabaseMaster.Movie.Table_name + "("+
                  DatabaseMaster.Movie.Movie_name+"INTEGER PRIMARY KEY"+
                  DatabaseMaster.Movie.Movie_Year+"TEXT)";
        sqLiteDatabase.execSQL(SQL_CREATE_MOVIE);

        String SQL_CREATE_COMMENTS =
                "CREATE TABLES"+DatabaseMaster.Comments.Table_name+"("+
                        DatabaseMaster.Comments.Movie_rating+"INTEGER PRIMARY KEY"+
                        DatabaseMaster.Comments.Movie_name+"TEXT"+
                        DatabaseMaster.Comments.Movie_comments+"TEXT)";
        sqLiteDatabase.execSQL(SQL_CREATE_COMMENTS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void registerUser(String username,String password){


    }
    public void loginUser(String username,String password){

        if (username=="admin"){
//         startActivity(Intent i = new Intent(this,AddMovie.class));



        }

    }




}
