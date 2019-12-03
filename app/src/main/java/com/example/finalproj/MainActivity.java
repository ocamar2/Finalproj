package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button entertune = findViewById(R.id.enterTune);
        // Intents are Android's way of specifying what to do/launch
        // Here we create an Intent for launching GameActivity and act on it with startActivity
        entertune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStartAct();
            }
        });

    }
    private void goToStartAct() {
        Intent intent = new Intent(this, StartActivity.class);
        startActivity(intent);
    }
}
