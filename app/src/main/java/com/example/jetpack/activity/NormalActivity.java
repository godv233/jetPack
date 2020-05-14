package com.example.jetpack.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpack.R;

/**
 * @Author godv
 * Date on 2020/5/14  11:48
 */
public class NormalActivity extends AppCompatActivity {
    private TextView mCxkTv, mJayTv;
    private int ticketCxk, ticketJay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);
        initView();
        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_cxk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ticketCxk++;
                mCxkTv.setText(String.valueOf(ticketCxk));
            }
        });
        findViewById(R.id.btn_jay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ticketJay++;
                mJayTv.setText(String.valueOf(ticketJay));
            }
        });
    }

    private void initView() {
        mCxkTv = findViewById(R.id.tv_cxk);
        mJayTv = findViewById(R.id.tv_jay);
        mCxkTv.setText(String.valueOf(ticketCxk));
        mJayTv.setText(String.valueOf(ticketJay));
    }
}
