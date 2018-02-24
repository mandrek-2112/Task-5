package com.example.rutanjit.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent3 = getIntent();
        int scr = intent3.getIntExtra("score", 0);
        String chk = Integer.toString(scr);
        chk=chk+"/3";
        TextView textView2 = findViewById(R.id.textView6);
        textView2.setText(chk);
    }
}
