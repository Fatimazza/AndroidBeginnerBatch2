package com.example.android.myapplication;

import com.squareup.picasso.Picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class LoadImageActivity extends AppCompatActivity {

    ImageView ivPicasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_image);

        ivPicasso = (ImageView) findViewById(R.id.ivPicasso);
        Picasso.with(this)
            .load("http://i.imgur.com/DvpvklR.png")
            .placeholder(R.mipmap.ic_launcher)
            .resize(500, 500)
            .centerCrop() //or centerInside
            .into(ivPicasso);
    }
}
