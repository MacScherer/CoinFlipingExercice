package com.example.coinflipingexercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButtonPlay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imageButtonPlay = findViewById(R.id.imageButtonPlay);

         imageButtonPlay.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(), secondActivity.class);

                 int randomNumber = new Random().nextInt(2);

                 intent.putExtra("number", randomNumber);
                 startActivity(intent);
             }
         });
    }
}