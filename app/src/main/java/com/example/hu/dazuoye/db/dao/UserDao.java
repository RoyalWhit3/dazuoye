
package com.example.hu.dazuoye.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.hu.dazuoye.db.UserSqliteOpenHelper;

/**
 * Created by ken on 2018/1/6.
 * 一个专门用于操作数据库的类，用于提供增删改查的方法
 */

public class UserDao {

    //引用工具类UserSqliteOpenHelper
    UserSqliteOpenHelper helper;

    //
    public UserDao(Context context){
        helper = new UserSqliteOpenHelper(context);
    }


    //如果做增删改操作，就getWritableDatabase,表示获得一个可写的数据库
    public void insert(String username, String password){

        SQLiteDatabase db = helper.getWritableDatabase();

        //插入数据
        db.execSQL("insert into user values(null,?,?)", new Object[]{username,password});

        //插入结束后，关闭数据库，释放资源
        db.close();
    }
    public void delete(String username){
        SQLiteDatabase db = helper.getWritableDatabase();

        //delete
        db.execSQL("delete from user where username=?", new Object[]{username});

        //删除后，关闭数据库，释放资源
        db.close();
    }
    public void update(String username,String password){
        SQLiteDatabase db = helper.getWritableDatabase();

        db.execSQL("update user set passwoad=? where username=?", new Object[]{password,username});
        //数组内应该按sql内顺序写
        db.close();
    }

    public String findOne(String username){

        SQLiteDatabase db = helper.getReadableDatabase();

//        db.execSQL("select * from user where username=?");

        return null;
    }
}
