package com.example.rutanjit.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                //  finish();
                quiz(v);
            }
        });

    }

    public void quiz(View view) {
        Intent intent = new Intent(this, Q1Activity.class);
        startActivity(intent);


    }
}
