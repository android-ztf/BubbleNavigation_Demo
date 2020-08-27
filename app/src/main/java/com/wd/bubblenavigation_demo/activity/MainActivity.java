package com.wd.bubblenavigation_demo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.wd.bubblenavigation_demo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化
        findViewById(R.id.open_top_navigation_bar).setOnClickListener(this);
        findViewById(R.id.open_top_float_navigation_bar).setOnClickListener(this);
        findViewById(R.id.open_bottom_equal_navigation_bar).setOnClickListener(this);
        findViewById(R.id.open_bottom_navigation_bar).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.open_top_navigation_bar:
                Toast.makeText(MainActivity.this,"跳转到顶部导航栏",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,TopBarActivity.class));
                break;
            case R.id.open_top_float_navigation_bar:
                Toast.makeText(MainActivity.this,"跳转到顶部悬浮导航栏",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,FloatingTopBarActivity.class));
                break;
            case R.id.open_bottom_equal_navigation_bar:
                Toast.makeText(MainActivity.this,"跳转到底部导航栏",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,BottomBarActivity.class));
                break;
            case R.id.open_bottom_navigation_bar:
                Toast.makeText(MainActivity.this,"跳转到底部悬浮导航栏",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,EqualBottomBarActivity.class));
                break;
        }
    }
}
