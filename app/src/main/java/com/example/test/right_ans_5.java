package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class right_ans_5 extends AppCompatActivity {

    public View v;
    private Button quitbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_ans_5);


       quitbutton2 = (Button)findViewById(R.id.quitButton2);

       quitbutton2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openMain_page();
           }
       });


    }

    public void openMain_page()
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        clickexit(v);


    }




    public void clickexit (View v)

    {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

    }

}
