package com.example.coinflipingexercice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    private ImageView imageViewCoin;
    private ImageButton buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageViewCoin = findViewById(R.id.imageViewCoin);
        buttonBack = findViewById(R.id.imageButtonBack);

        getNumber();
        buttonBack.setOnClickListener(v -> {
            finish();
        });
    }

    private void getNumber() {
        Bundle data = getIntent().getExtras();
        int number = data.getInt("number");

        verifyNumber(number);
    }

    private void verifyNumber(int number) {
        if (number == 0){
            imageViewCoin.setImageResource(R.drawable.moeda_cara);
        }else {
            imageViewCoin.setImageResource(R.drawable.moeda_coroa);
        }
    }
}