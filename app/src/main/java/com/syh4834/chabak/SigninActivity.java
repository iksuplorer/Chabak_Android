package com.syh4834.chabak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class SigninActivity extends AppCompatActivity {
    Button btnBack;
    Button btnSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        btnBack = findViewById(R.id.btn_back);
        btnSignin = findViewById(R.id.btn_signin);

        btnBack.setOnClickListener(l -> {
            Intent intent = new Intent(this, InitialActivity.class);
            startActivity(intent);
            finish();
        });

        btnSignin.setOnClickListener(l -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}