package com.example.hu.dazuoye.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ken on 2018/1/6.
 */

public class UserSqliteOpenHelper extends SQLiteOpenHelper{

    public UserSqliteOpenHelper(Context context) {
        //context对象 ：应用上下文对象
        //name:数据库的名称
        //factory:游标工厂 当设置为null时就为默认的游标工厂
        //version:版本，数据库的版本，第一次发行为1
        //初始版本必须大于0，并且只能升级不能降级
        super(context, "user.db", null, 1);
    }

    // 数据库文件第一次创建时会执行的方法onCreate
    @Override
    public void onCreate(SQLiteDatabase db) {
        System.out.println("onCreate方法被调用了");
        //在数据库中去创建表，数据库最终存储都为字符串

        db.execSQL("create table user( _id integer primary key autoincrement, username varchar(30), password varchar(40))");

    }

    //用于版本更新后调用的方法
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        System.out.println("onUpgrade方法被调用了");
    }
}
