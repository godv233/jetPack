package com.example.jetpack.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jetpack.R;
import com.example.jetpack.navigation.NavigationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NormalActivity.class));
            }
        });
        findViewById(R.id.btn_view_model).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ViewModelActivity.class));
            }
        });
        findViewById(R.id.btn_live_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LiveDataActivity.class));
            }
        });
        findViewById(R.id.btn_data_binding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,DataBindingActivity.class));
            }
        });
        findViewById(R.id.btn_data_binding).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NavigationActivity.class));
            }
        });
        findViewById(R.id.btn_navigation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NavigationActivity.class));
            }
        });
    }
}
