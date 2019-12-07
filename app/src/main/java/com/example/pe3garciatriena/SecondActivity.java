package com.example.pe3garciatriena;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity2);
    }

    public void home(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
