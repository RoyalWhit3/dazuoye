package com.example.hu.dazuoye;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by a1398 on 2018/1/6.
 */

public class ReCharge extends TitleActivity {
    private EditText mEditText;
    private TextView mPayForTv;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recharge);
        mEditText = (EditText) findViewById(R.id.pay_TextView);
        mPayForTv = (TextView) findViewById(R.id.pay_For_Tv);
        //CharSequence title = null;
        //title = getTitle_1();
        //showBackwardView(title,true);
        setTitle("用户充值");

        setBottomImg("right");
    }

    public void pay_Ed(View view) {
        mEditText.setText("");
        mEditText.setHint("请输入您想要充值的账户");
        mPayForTv.setText("");
    }
}
