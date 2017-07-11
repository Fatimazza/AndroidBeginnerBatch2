package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView teksData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        MySerializableObject mySerializableObject = (MySerializableObject) intent.getSerializableExtra("keyDataDiri");

        teksData = (TextView) findViewById(R.id.teksData);
        teksData.setText(mySerializableObject.getName() + " " + mySerializableObject.getAge()
            + " " +mySerializableObject.getAddresses());
    }
}
