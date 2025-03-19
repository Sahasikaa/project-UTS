package com.example.projectuts;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class FirstPage extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_firstpage);

        login =  findViewById(R.id.button);

        login.setOnClickListener(v -> {
            Intent act1 = new Intent(getApplicationContext(), home.class);
            startActivity(act1);
        });
    }
}