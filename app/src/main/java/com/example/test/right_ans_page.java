package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
public class right_ans_page extends AppCompatActivity {
    public static final String EXTRA_NUMBER ="com.example.test.EXTRA_NUMBER";
    private Button nextButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right_ans_page);


        nextButton1 = (Button)findViewById(R.id.nextButton1);
        nextButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecond_question();
            }
        });





    }

    public void openSecond_question()
    {

        EditText money_text = (EditText) findViewById(R.id.money_text);
        int money = Integer.parseInt(money_text.getText().toString());

        Intent intent = new Intent(this,second_question.class);
       intent.putExtra(EXTRA_NUMBER,money);
        startActivity(intent);

    }


}
