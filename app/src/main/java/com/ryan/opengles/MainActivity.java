package com.ryan.opengles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ryan.opengles.sample01.Sample01Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        Intent intent = new Intent(MainActivity.this, Sample01Activity.class);
        startActivity(intent);
    }
}
