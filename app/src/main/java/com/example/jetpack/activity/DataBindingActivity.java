package com.example.jetpack.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.R;
import com.example.jetpack.databinding.DataBindingBinding;
import com.example.jetpack.viewModel.DataBindingViewModel;
import com.example.jetpack.viewModel.LiveDataViewModel;


/**
 * @Author godv
 * Date on 2020/5/14  16:04
 */
public class DataBindingActivity extends AppCompatActivity {
    private DataBindingViewModel dataBindingViewModel;
    private DataBindingBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //数据和view的双向绑定
        binding= DataBindingUtil.setContentView(this,R.layout.data_binding);
//        setContentView(R.layout.data_binding);
        dataBindingViewModel=new ViewModelProvider(this).get(DataBindingViewModel.class);
        binding.setData(dataBindingViewModel);
        binding.setLifecycleOwner(this);
    }
}
