package com.example.jetpack.navigation;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.jetpack.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * navigation分为三部
 * 1.   nav_graph
 * 2.   nav_Host
 * 3.   naV_controller
 * @Author godv
 * Date on 2020/5/14  18:54
 */
public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_layout);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation_view);
        //实例化naV_controller
        NavController controller= Navigation.findNavController(this,R.id.fragment2);
        //声明appBar
        AppBarConfiguration appBarConfiguration=new AppBarConfiguration.Builder(bottomNavigationView.getMenu())
                .build();
        NavigationUI.setupActionBarWithNavController(this,controller,appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView,controller);



    }
}
