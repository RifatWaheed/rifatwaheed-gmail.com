package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class fourth_question extends AppCompatActivity {

         private Button mush;
         private Button kayes;
         private Button shakib;
         private Button habibul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_question);

        mush = (Button)findViewById(R.id.mush);
        kayes = (Button)findViewById(R.id.kayes);
        habibul = (Button)findViewById(R.id.habibul);
        shakib = (Button)findViewById(R.id.shakib);

        mush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRight_ans_4();
            }
        });


        kayes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

        habibul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

        shakib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

    }


    public void openRight_ans_4(){

        Intent intent = new Intent(this,right_ans_4.class);
        startActivity(intent);



    }



    public void openSorry_page()
    {
        Intent intent = new Intent (this,sorry_page.class);

        startActivity(intent);

    }




}
