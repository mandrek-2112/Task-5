package com.example.rutanjit.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q1Activity extends AppCompatActivity {
    Button op1, op2, op3, op4;
    Integer s = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        Intent intent = getIntent();
        op1 = (Button) findViewById(R.id.button2);
        op2 = (Button) findViewById(R.id.button3);
        op3 = (Button) findViewById(R.id.button4);
        op4 = (Button) findViewById(R.id.button5);

        op1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                next(v);
            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                next(v);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                next(v);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s++;
                //  finish();
                next(v);
            }
        });

    }

    public void next(View view) {
        Intent intent1 = new Intent(this, Q2Activity.class);
        intent1.putExtra("score", s);
        startActivity(intent1);
        finish();
    }
}
