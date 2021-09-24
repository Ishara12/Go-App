package com.example.go_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Go_DeleteBus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_delete_bus);
    }

    public void nextActivity01(View v){
        Intent i = new Intent(this, Go_AdminHome.class);
        startActivity(i);
    }
}