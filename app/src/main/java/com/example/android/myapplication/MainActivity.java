package com.example.android.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

//Kelas menampung objek - objek
public class MainActivity extends AppCompatActivity {

    TextView tvTeks;

    //method Main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.rlLayout);

        Button tombol = new Button(this);
        tombol.setText("Tombol");
        layout.addView(tombol);

        Button click = (Button) findViewById(R.id.btnClick);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Tombol diklik", Toast.LENGTH_SHORT)
                .show();
            }
        };

        tombol.setOnClickListener(listener);
        click.setOnClickListener(listener);


//        tvTeks = (TextView) findViewById(R.id.tvTeks);
//        ImageView ivGambar = (ImageView) findViewById(R.id.ivGambar);
//        tvTeks.setText("Text dari Activity");
//
//        tampilkanText();
//
//        cara mengganti gambar lewat Activity
//        ivGambar.setImageDrawable(getResources().getDrawable(R.drawable.ic_gambar));
//        ivGambar.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_gambar));

    }

    //method atau function tambahan
    public void tampilkanText(){
        //print di console
        Log.d("Text ", " dari Log");
        //tampilkan di textView
        tvTeks.setText("Text dari Method Luar");
    }

}
