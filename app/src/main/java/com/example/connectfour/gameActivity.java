package com.example.connectfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Button;

public class gameActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int getOrientation = getRequestedOrientation();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        canvasView canvasView=new canvasView(this);
        setContentView(canvasView);

    }
}
