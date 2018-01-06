package com.example.hu.dazuoye;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.hu.dazuoye.db.UserSqliteOpenHelper;

public class MainActivity extends TitleActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * @ken
         * --2018/1/6
         * 2 lines were added
         */
        UserSqliteOpenHelper helper = new UserSqliteOpenHelper(this);//用于第一次数据库的创建
        SQLiteDatabase db = helper.getWritableDatabase();//调用此方法后才会完成创建数据库



         setTitle("交通管理系统");
         showBackwardView(R.string.text_back,false);
         setBottomImg("home");


                




    }


    //主界面返回键重置为回到桌面
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);

    }
}
