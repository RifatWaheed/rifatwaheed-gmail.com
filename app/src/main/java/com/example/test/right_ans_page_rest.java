package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class right_ans_page_rest extends AppCompatActivity {

    private Button nextButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_ans_page_rest);

        nextButton2 = (Button)findViewById(R.id.nextButton2);

        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThird_question();
            }
        });

    }

        public void openThird_question()
        {

            Intent intent3 = new Intent(this,third_question.class);
            startActivity(intent3);

        }

}
