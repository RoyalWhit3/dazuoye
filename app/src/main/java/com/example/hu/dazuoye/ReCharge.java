package com.example.hu.dazuoye;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by a1398 on 2018/1/6.
 */

public class ReCharge extends TitleActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recharge);
        //CharSequence title = null;
        //title = getTitle_1();
        //showBackwardView(title,true);
        setTitle("用户充值");

        setBottomImg("right");
    }
}
