package com.lanjing.monkey.secondmainmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.lanjing.monkey.MainActivity;
import com.lanjing.monkey.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondModuleMainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.btn_one)Button btnOne;

    @OnClick(R.id.btn_one)
    public void onclick(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_mainmodule_main);
        ButterKnife.bind(this);
        //btnOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_one:
                Log.i("TAG", "v.getId(): " + v.getId() + ",   R2.id.btn_one:" + R2.id.btn_one);
                onclick();
                break;
        }
    }
}
