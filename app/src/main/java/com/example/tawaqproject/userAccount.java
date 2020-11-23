package com.example.tawaqproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class userAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);
    }

    public void backToMenu(View V){

        Intent i = new Intent(this,theMenu.class);
        startActivity(i);

    }

    // Here editAccount Method

}