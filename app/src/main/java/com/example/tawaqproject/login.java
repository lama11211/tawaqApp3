package com.example.tawaqproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void backToMain1(View V){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
}