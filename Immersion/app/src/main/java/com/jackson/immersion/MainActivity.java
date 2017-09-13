package com.jackson.immersion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jackson.immersion.activity.ColorActivity;
import com.jackson.immersion.activity.FragmentActivity;
import com.jackson.immersion.activity.ImageActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick({R.id.imageActivity, R.id.colorActivity, R.id.fragment})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageActivity:
               startActivity(new Intent(MainActivity.this, ImageActivity.class));
                break;
            case R.id.colorActivity:
                startActivity(new Intent(MainActivity.this, ColorActivity.class));
                break;
            case R.id.fragment:
                startActivity(new Intent(MainActivity.this, FragmentActivity.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }
}
