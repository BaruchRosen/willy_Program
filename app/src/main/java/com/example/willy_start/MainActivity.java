package com.example.willy_start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void logP(View view) {
        // Set password and name

        Intent intent = new Intent(MainActivity.this, MainActionScreen.class);
        startActivity(intent);

    }
}
