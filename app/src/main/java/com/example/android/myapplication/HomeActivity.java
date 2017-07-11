package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LayoutInflater inflater = getLayoutInflater();
        LayoutInflater inflater2 = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);

//        inflater2.inflate(R.layout.layout_tambahan, (LinearLayout) findViewById(R.id.llhome));

        LinearLayout layout = (LinearLayout) findViewById(R.id.llhome);
        View view = inflater.inflate(R.layout.layout_tambahan, (LinearLayout) findViewById(R.id.llhome), false);
        layout.addView(view);
    }
}
