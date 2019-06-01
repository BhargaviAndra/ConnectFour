package com.example.connectfour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import static android.graphics.Color.BLACK;

public class MainActivity extends AppCompatActivity {
public static int SPLASH_TIME_OUT=4000;
private ConstraintLayout color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color=(ConstraintLayout)findViewById(R.id.color);
color.setBackgroundColor(BLACK);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
            }
        },SPLASH_TIME_OUT);
    }
}
