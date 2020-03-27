package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {


    private Button playButton;
    private Button quitButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playButton = (Button) findViewById(R.id.playButton);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfirst_question();
            }
        });

    }

    public void openfirst_question(){

        Intent intent = new Intent(this,first_question.class);
        startActivity(intent);
    }


    public void clickexit1 (View v)

    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);



    }

}
