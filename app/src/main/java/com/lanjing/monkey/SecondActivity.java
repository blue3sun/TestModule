package com.lanjing.monkey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/4/20 13:39
 */

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R2.id.tv_second_title)
    TextView mTvTitle;
    @BindView(R2.id.btn_second_one)
    Button mBtnOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTvTitle.setText("原始的主module的第二个界面");
        mTvTitle.setOnClickListener(this);
        mBtnOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R2.id.tv_second_title:
                Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.tv_second_title:"+R2.id.tv_second_title);
                Toast.makeText(this,"点击了TextView",Toast.LENGTH_LONG).show();
                break;
            case R2.id.btn_second_one:
                Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.btn_second_one:"+R2.id.btn_second_one);
                Toast.makeText(this,"点击了Button",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
