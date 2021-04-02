package com.ishuinzu.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String DATA = "DATA";
    private TextView txtShowData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtShowData = findViewById(R.id.txtShowData);

        //Getting Data From Intent
        String data = getIntent().getExtras().getString(DATA);

        //Setting Data To The TextView
        txtShowData.setText(data);
    }
}