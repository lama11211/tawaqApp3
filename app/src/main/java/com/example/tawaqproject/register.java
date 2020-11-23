package com.example.tawaqproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void backToMain(View V){

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

    // The register User Account method V.IM
    //----!
    public void registerBtn(View V){

        Intent i = new Intent(this,home.class);
        startActivity(i);
        finish();
    }
}