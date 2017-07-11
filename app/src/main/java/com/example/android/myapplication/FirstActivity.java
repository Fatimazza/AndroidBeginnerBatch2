package com.example.android.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstActivity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        ArrayList<String> alamat = new ArrayList<String>(
            Arrays.asList("Jalan Damai 89", "Jalan Damai 56"));
        final MySerializableObject mySerializableObject = new MySerializableObject("Fatima", 17, alamat);

        next = (Button) findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("keyDataDiri", mySerializableObject);
                startActivity(intent);
            }
        });
    }
}
