package com.example.jetpack.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.R;
import com.example.jetpack.viewModel.LiveDataViewModel;

/**
 * @Author godv
 * Date on 2020/5/14  15:35
 */
public class LiveDataActivity extends AppCompatActivity {
    private TextView mCxkTv, mJayTv;
    private LiveDataViewModel liveDataViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.live_data_layout);
        liveDataViewModel=new ViewModelProvider(this).get(LiveDataViewModel.class);
        initView();
        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_cxk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveDataViewModel.addCxk();
            }
        });
        findViewById(R.id.btn_jay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liveDataViewModel.addJay();
            }
        });
    }

    private void initView() {
        mCxkTv = findViewById(R.id.tv_cxk);
        mJayTv = findViewById(R.id.tv_jay);
        liveDataViewModel.getTicketCxk().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                mCxkTv.setText(String.valueOf(liveDataViewModel.getTicketCxk().getValue()));
            }
        });
        liveDataViewModel.getTicketJay().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                mJayTv.setText(String.valueOf(liveDataViewModel.getTicketJay().getValue()));
            }
        });
    }
}
