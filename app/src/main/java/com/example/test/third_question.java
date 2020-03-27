package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class third_question extends AppCompatActivity {


    private Button birthChrist;
    private Button birthPeter;
    private Button Crux;
    private Button wrongAns;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);

        birthChrist = (Button)findViewById(R.id.birthChrist);
        birthPeter= (Button)findViewById(R.id.birthPeter);
        Crux = (Button)findViewById(R.id.Crux);
        wrongAns = (Button)findViewById(R.id.wrongAns);


        birthChrist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });



        birthPeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });


        Crux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRight_ans_3();
            }
        });


        wrongAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });


    }


public void openRight_ans_3(){


        Intent intent = new Intent(this,right_ans_3.class);
        startActivity(intent);



}




    public void openSorry_page()
    {
        Intent intent = new Intent (this,sorry_page.class);

        startActivity(intent);

    }




}
