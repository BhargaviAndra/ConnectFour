package com.example.connectfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
private Button startGame;
private RadioGroup radioGroup;
private RadioButton red,yellow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int getOrientation = getRequestedOrientation();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        startGame=(Button)findViewById(R.id.startGame);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        red=(RadioButton)findViewById(R.id.red);
        yellow=(RadioButton)findViewById(R.id.yellow);




        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeActivity.this, gameActivity.class);
                startActivity(intent);
                finish();

            }}
        );

        }
}
