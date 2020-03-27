package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class right_ans_3 extends AppCompatActivity {


    private  Button nextButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_ans_3);

        nextButton3 = (Button)findViewById(R.id.nextButton3);

        nextButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openfourth_question();
            }
        });


    }

    public  void  openfourth_question()
    {


        Intent intent = new Intent(this,fourth_question.class);
        startActivity(intent);
    }




}
