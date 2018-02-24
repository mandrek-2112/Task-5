package com.example.rutanjit.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Q3Activity extends AppCompatActivity {

    Button op1,op2,op3,op4;
    Integer s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        Intent intent2 = getIntent();
        int scr = intent2.getIntExtra("score", 0);
        s=scr;
        //String chk = Integer.toString(scr);
        op1 = (Button) findViewById(R.id.button10);
        op2 = (Button) findViewById(R.id.button11);
        op3 = (Button) findViewById(R.id.button12);
        op4 = (Button) findViewById(R.id.button13);

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
        op2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //  finish();
                next(v);
            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                s++;
                //  finish();
                next(v);
            }
        });

    }
    public void next(View view) {
        Intent intent3 = new Intent(this, ResultActivity.class);
        intent3.putExtra("score", s);
        startActivity(intent3);
        finish();
    }
}
