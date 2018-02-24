package com.example.rutanjit.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Q2Activity extends AppCompatActivity {
    Button op1,op2,op3,op4;
    Integer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        Intent intent1 = getIntent();
        int scr = intent1.getIntExtra("score", 0);
        s=scr;
        //String chk = Integer.toString(scr);
        op1 = (Button) findViewById(R.id.button6);
        op2 = (Button) findViewById(R.id.button7);
        op3 = (Button) findViewById(R.id.button8);
        op4 = (Button) findViewById(R.id.button9);

        op1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                next(v);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
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
        Intent intent2 = new Intent(this, Q3Activity.class);
        intent2.putExtra("score", s);
        startActivity(intent2);
        finish();
    }
}
