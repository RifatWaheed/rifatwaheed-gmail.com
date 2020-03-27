package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.* ;



public class second_question extends AppCompatActivity {


    private Button sep8;
    private Button nov8;
    private Button jan8;
    private Button march8;

    public static final String EXTRA_NUMBER= "com.example.test.EXTRA_NUMBER";

    public int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_question);


        sep8 = (Button) findViewById(R.id.sep8);
        nov8 = (Button) findViewById(R.id.nov8);
        march8 = (Button) findViewById(R.id.march8);
        jan8 = (Button) findViewById(R.id.jan8);



       sep8.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openRight_ans_page_rest();
           }
       });




        nov8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });



        march8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

        jan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });






    }


    public void openSorry_page()
    {
        Intent intent = new Intent (this,sorry_page.class);

        startActivity(intent);

    }


    public void openRight_ans_page_rest()
    {

        Intent intent_rest = new Intent(this,right_ans_page_rest.class);

        startActivity(intent_rest);



    }



}
