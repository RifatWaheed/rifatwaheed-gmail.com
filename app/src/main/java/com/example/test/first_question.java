package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class first_question extends AppCompatActivity {

    private Button h2o_button;
    private Button nahco3_button;
    private Button nacl_button;
    private Button ch4_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        h2o_button = (Button) findViewById(R.id.h2o_button);
        nahco3_button= (Button) findViewById(R.id.nahco3_button);
        nacl_button = (Button) findViewById(R.id.nacl_button);
        ch4_button = (Button)findViewById(R.id.ch4_button);


        h2o_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

        ch4_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });

        nahco3_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSorry_page();
            }
        });


        nacl_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRight_ans_page();
            }
        });



    }
  public void  openSorry_page()
  {

      Intent intent1 = new Intent(this,sorry_page.class);
      startActivity(intent1);


  }

    public void  openRight_ans_page()
    {
        Intent intent2 = new Intent(this,right_ans_page.class);
        startActivity(intent2);


    }
}
