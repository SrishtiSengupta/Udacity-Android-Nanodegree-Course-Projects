package com.myapp.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotify = (Button)findViewById(R.id.button_spotify);
        Button super_duo = (Button)findViewById(R.id.button_score);
        Button build_it_bigger = (Button)findViewById(R.id.button_build);
        Button xyz = (Button)findViewById(R.id.button_reader);
        Button capstone = (Button)findViewById(R.id.button_capstone);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on Spotify Streamer!", Toast.LENGTH_SHORT).show();
            }
        });

        super_duo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on Super Duo!", Toast.LENGTH_SHORT).show();
            }
        });

        build_it_bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on Build it Bigger!", Toast.LENGTH_SHORT).show();
            }
        });

        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on XYZ Reader!", Toast.LENGTH_SHORT).show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked on Capstone Project!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
