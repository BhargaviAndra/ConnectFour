package com.example.connectfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {
private Button startGame;
private EditText player1;
private EditText player2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int getOrientation = getRequestedOrientation();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        startGame=(Button)findViewById(R.id.startGame);
        player1=(EditText)findViewById(R.id.player1);
        player2=(EditText)findViewById(R.id.player2);
        startGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player1.getText().equals(""))
                    player1.setText("player1");
                if (player2.getText().equals(""))
                    player2.setText("player2");
                else {
                   // player1 = (EditText) player1.getText();
                    //player2 = (EditText) player2.getText();
                }
                Intent intent = new Intent(HomeActivity.this, gameActivity.class);
                startActivity(intent);
                finish();

            }}
        );

        }
}
