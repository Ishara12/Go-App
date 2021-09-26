package com.example.go_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busroute_layout);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bus List");
        //actionBar.setSubtitle("Hello");
        //actionBar.setIcon(R.drawable.bluebus);
        //actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.Profile:
                startActivity(new Intent(MainActivity.this, Go_SeatBooking.class));
                Toast.makeText(this, "Profile selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BusSearch:
                Toast.makeText(this, "Bus Search selected", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}