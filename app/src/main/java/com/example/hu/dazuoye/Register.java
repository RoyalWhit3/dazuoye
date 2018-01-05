package com.example.hu.dazuoye;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by a1398 on 2018/1/5.
 */

public class Register extends TitleActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        setTitle("用户注册");
        showBackwardView(R.string.text_back,false);
        showEndView(false);


    }


    public void btn_register(View view) {
        //点击注册



        //跳转登录
        startActivity(new Intent(this,Login.class));
    }
}
