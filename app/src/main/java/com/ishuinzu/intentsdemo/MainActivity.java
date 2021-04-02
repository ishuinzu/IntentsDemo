package com.ishuinzu.intentsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*private EditText edtData;
    private Button btnSendData;
    private Button btnOpenActivity;
    private EditText edtData2;
    private Button btnSendData2;
    private EditText edtData3;
    private Button btnSendData3;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*edtData = findViewById(R.id.edtData);
        btnSendData = findViewById(R.id.btnSendData);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Send Data To Second Activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(SecondActivity.DATA, "Data : " + edtData.getText().toString());
                startActivity(intent);
            }
        });
        btnOpenActivity = findViewById(R.id.btnOpenActivity);

        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start Another Activity
                Intent intent = new Intent(MainActivity.this, AnotherActivity.class);
                startActivity(intent);
            }
        });
        edtData2 = findViewById(R.id.edtData2);
        btnSendData2 = findViewById(R.id.btnSendData2);

        btnSendData2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sending Data Using Implicit Intent
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Data : " + edtData2.getText().toString());
                intent.setType("text/plain");

                //Try to startActivity
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    //Implementation of what should your app do if the specified type intent is not found
                    e.printStackTrace();
                }
            }
        });
        edtData3 = findViewById(R.id.edtData3);
        btnSendData3 = findViewById(R.id.btnSendData3);

        btnSendData3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Open URL or Send Data
                Uri uri = Uri.parse(edtData3.getText().toString());
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                //Setting Package Name For Chrome
                intent.setPackage("com.android.chrome");
                intent.setData(uri);

                //Try to startActivity
                try {
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    //Specify what should your app do when no specified intent is found
                    e.printStackTrace();
                }
            }
        });*/
    }
}