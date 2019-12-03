package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button beginSong = findViewById(R.id.beginSong);
        // Intents are Android's way of specifying what to do/launch
        // Here we create an Intent for launching GameActivity and act on it with startActivity

        beginSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToListenAct();
            }
        });

    }
    private void goToListenAct() {
        Intent intent = new Intent(this, ListenActivity.class);
        startActivity(intent);
    }
}
