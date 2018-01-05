package com.example.hu.dazuoye;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by a1398 on 2018/1/5.
 */

public class Login extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }

    public void login(View v) {
        System.out.println("click");
        startActivity(new Intent(this,MainActivity.class));
    }

    public void register(View v){

        startActivity(new Intent(this,Register.class));
    }
}
