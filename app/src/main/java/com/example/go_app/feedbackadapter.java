package com.example.go_app;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class feedbackadapter extends FirebaseRecyclerAdapter<feedbackmodel,feedbackadapter.feedbackviewholder> {

    public feedbackadapter(@NonNull FirebaseRecyclerOptions<feedbackmodel> options) {
        super(options);
    }




    @Override
    protected void onBindViewHolder(@NonNull feedbackviewholder holder, int position, @NonNull feedbackmodel model) {


        holder.feddback.setText(model.getFeddback());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(holder.feddback.getContext());
                builder.setTitle(" Delete customer feedback");

                builder.setMessage("Are you Sure Delete Feedback ");


                builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        FirebaseDatabase.getInstance().getReference().child("feedback")
                                .child(getRef(position).getKey()).removeValue();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
                builder.show();

            }
        });



    };





    @NonNull
    @Override
    public feedbackviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feedbacksingle, parent, false);

        return new feedbackviewholder(view);


    }

    class feedbackviewholder extends RecyclerView.ViewHolder {

        TextView feddback;

        ImageView delete;
        public feedbackviewholder(@NonNull View itemView) {

            super(itemView);

            feddback = (TextView) itemView.findViewById(R.id.feddback);
            delete=(ImageView)itemView.findViewById(R.id.deleteicon);


        }
    }


    }









