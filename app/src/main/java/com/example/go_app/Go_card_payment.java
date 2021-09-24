package com.example.go_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Go_card_payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_card_payment);
    }
public void Go_payment_sucessfull(View v)
  {
      Intent i = new Intent(this,Go_payment_sucessfull.class);
      starActivity(i);
  }

    private void starActivity(Intent i) {
    }

}
