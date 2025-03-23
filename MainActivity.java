package com.example.coba1;

import android.os.Bundle;
import android.view.View;

import android.widget.CheckBox;

import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnApply(View view) {
        // Get selected star rating
        RadioGroup rgBintang = findViewById(R.id.rgBintang);
        int selectedBintangId = rgBintang.getCheckedRadioButtonId();
        String rating = "Belum dipilih";

        if (selectedBintangId != -1) {
            RadioButton selectedBintang = findViewById(selectedBintangId);
            rating = selectedBintang.getText().toString();
        }

        // Get checked review scores
        StringBuilder reviewScores = new StringBuilder();
        CheckBox[] reviewCheckBoxes = {
                findViewById(R.id.cbUlasan7),
                findViewById(R.id.cbUlasan8),
                findViewById(R.id.cbUlasan9),
                findViewById(R.id.cbUlasan10)
        };

        for (CheckBox cb : reviewCheckBoxes) {
            if (cb.isChecked()) {
                reviewScores.append(cb.getText().toString()).append(", ");
            }
        }

        if (reviewScores.length() == 0) {
            reviewScores.append("Tidak ada skor ulasan yang dipilih");
        } else {
            reviewScores.setLength(reviewScores.length() - 2); // Remove last comma
        }

        // Get selected areas
        StringBuilder selectedAreas = new StringBuilder();
        CheckBox[] areaCheckBoxes = {
                findViewById(R.id.cbKetintang),
                findViewById(R.id.cbJambangan),
                findViewById(R.id.cbGnSari),
                findViewById(R.id.cbWiyung),
                findViewById(R.id.cbSidoarjo),
                findViewById(R.id.cbJakarta),
                findViewById(R.id.cbMboh)
        };

        for (CheckBox cb : areaCheckBoxes) {
            if (cb.isChecked()) {
                selectedAreas.append(cb.getText().toString()).append(", ");
            }
        }

        if (selectedAreas.length() == 0) {
            selectedAreas.append("Tidak ada area yang dipilih");
        } else {
            selectedAreas.setLength(selectedAreas.length() - 2); // Remove last comma
        }

        // Show results with Toast
        String result = "Rating Bintang: " + rating +
                "\nSkor Ulasan: " + reviewScores.toString() +
                "\nArea: " + selectedAreas.toString();

        Toast.makeText(this, result, Toast.LENGTH_LONG).show();
    }

}

