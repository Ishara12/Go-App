package com.example.go_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FeedbackMain extends AppCompatActivity {


    FloatingActionButton fb;

    private Button button123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_main);


        button123=findViewById(R.id.button123);
        button123.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent i = new Intent(FeedbackMain.this,AdminAllfeedback.class);
                startActivity(i);
                finish();
            }
        });



        fb=(FloatingActionButton)findViewById(R.id.fadd);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(),Go_Feedback.class));



            }


        });


    }





}