package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.*;

public class fifth_question extends AppCompatActivity {
    private Button emilio;
    private Button nathan;
    private Button james;
    private Button charles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_question);

            emilio = (Button)findViewById(R.id.emilio);
            nathan = (Button)findViewById(R.id.nathan);
            charles = (Button)findViewById(R.id.charles);
            james = (Button)findViewById(R.id.james);

            emilio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openRight_ans_5();
                }
            });


            nathan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSorry_page();
                }
            });

            charles.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSorry_page();
                }
            });

            james.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openSorry_page();
                }
            });

        }


    public void openRight_ans_5(){

        Intent intent = new Intent(this,right_ans_5.class);
        startActivity(intent);



    }



    public void openSorry_page()
    {
        Intent intent = new Intent (this,sorry_page.class);

        startActivity(intent);

    }




}


