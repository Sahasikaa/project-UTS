package com.example.projectuts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button Masuk;
    Button Daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Masuk = findViewById(R.id.button3);
        Masuk.setOnClickListener(v -> {
            Intent act1 = new Intent(getApplicationContext(), FirstPage.class);
            startActivity(act1);
        });

        Daftar = findViewById(R.id.button4);
        Daftar.setOnClickListener(v -> {
            Intent act2 = new Intent(getApplicationContext(), Signup.class);
            startActivity(act2);
        });
    }
}