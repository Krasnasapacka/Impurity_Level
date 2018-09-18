package com.example.liudas.beissaugojimo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.liudas.beissaugojimo"))
        {
            TextView nr2 = (TextView) findViewById(R.id.nr2);
            String nr22= getIntent().getExtras().getString("com.example.liudas.beissaugojimo");
            nr2.setText(nr22);
        }
        if (getIntent().hasExtra("com.example.liudas.beissaugojimo.2"))
        {
            TextView nr3 = (TextView) findViewById(R.id.nr3);
            String nr33= getIntent().getExtras().getString("com.example.liudas.beissaugojimo.2");
            nr3.setText(nr33);
        }
        if (getIntent().hasExtra("com.example.liudas.beissaugojimo.3"))
        {
            TextView nr4 = (TextView) findViewById(R.id.nr4);
            String nr44= getIntent().getExtras().getString("com.example.liudas.beissaugojimo.3");
            nr4.setText(nr44);
        }
    }
}
