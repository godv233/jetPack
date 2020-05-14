package com.example.jetpack.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.viewModel.MyViewModel;
import com.example.jetpack.R;

/**
 * @Author godv
 * Date on 2020/5/14  11:49
 */
public class ViewModelActivity extends AppCompatActivity {
    private TextView mCxkTv, mJayTv;
    private MyViewModel viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_layout);
        //实例化
        viewModel=new ViewModelProvider(this).get(MyViewModel.class);
        initView();
        initListener();
    }
    private void initListener() {
        findViewById(R.id.btn_cxk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setTicketCxk(viewModel.getTicketCxk()+1);
                mCxkTv.setText(String.valueOf(viewModel.getTicketCxk()));
            }
        });
        findViewById(R.id.btn_jay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setTicketJay(viewModel.getTicketJay()+1);
                mJayTv.setText(String.valueOf(viewModel.getTicketJay()));
            }
        });
    }

    private void initView() {
        mCxkTv = findViewById(R.id.tv_cxk);
        mJayTv = findViewById(R.id.tv_jay);
        mCxkTv.setText(String.valueOf(viewModel.getTicketCxk()));
        mJayTv.setText(String.valueOf(viewModel.getTicketJay()));
    }
}
