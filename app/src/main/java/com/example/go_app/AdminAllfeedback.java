package com.example.go_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminAllfeedback extends AppCompatActivity {

    private Button feed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_allfeedback);



        feed=findViewById(R.id.feed);
        feed.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(AdminAllfeedback.this,Allfeedbacks.class);
                startActivity(i);
                finish();
            }
        });

    }
}