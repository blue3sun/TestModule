package com.lanjing.monkey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @BindView(R2.id.tv_title) TextView mTvTitle;
    @BindView(R2.id.btn_one) Button mBtnOne;

    @OnClick(R2.id.btn_one)
    public void onClickBtn(){//这个方法不会执行 在initView()被覆盖设置了点击事件监听器
        Log.i("TAG", "R2.id.btn_one:"+R2.id.btn_one);
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        mTvTitle.setText("原始的主module的第一个界面");
        mTvTitle.setOnClickListener(this);
        mBtnOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R2.id.tv_title:
//                Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.tv_title:"+R2.id.tv_title);
//                Toast.makeText(this,"点击了TextView",Toast.LENGTH_LONG).show();
//                break;
//            case R2.id.btn_one:
//                Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.btn_one:"+R2.id.btn_one);
//                Intent intent = new Intent(this,SecondActivity.class);
//                startActivity(intent);
//                break;
//        }

        Log.i("TAG", "R2.id.btn_one == R.id.btn_one:"+ (R2.id.btn_one == R.id.btn_one));

        if (v.getId() == R2.id.tv_title) {
            Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.tv_title:"+R2.id.tv_title);
            Toast.makeText(this,"点击了TextView",Toast.LENGTH_LONG).show();
        }

        //下面的两个if里面的代码都会执行
        if (v.getId() == R.id.btn_one) {
            Log.i("TAG", "v.getId(): "+v.getId()+",   R.id.btn_one:"+R.id.btn_one);
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }

        if (v.getId() == R2.id.btn_one) {
            Log.i("TAG", "v.getId(): "+v.getId()+",   R2.id.btn_one:"+R2.id.btn_one);
            Intent intent = new Intent(this,SecondActivity.class);
            startActivity(intent);
        }
    }
}
