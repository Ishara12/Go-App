package com.example.go_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Allfeedbacks extends AppCompatActivity {

    feedbackadapter feedbackadapter;
    RecyclerView reView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allfeedbacks);

        reView=(RecyclerView)findViewById(R.id.reView);

        reView.setLayoutManager(new LinearLayoutManager(this));



        FirebaseRecyclerOptions<feedbackmodel> options =
                new FirebaseRecyclerOptions.Builder<feedbackmodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("feedback"), feedbackmodel.class)
                        .build();


        feedbackadapter= new feedbackadapter(options);


        reView.setAdapter(feedbackadapter);



    }



    @Override
    protected void onStart() {
        super.onStart();
       feedbackadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        feedbackadapter.stopListening();
    }

}