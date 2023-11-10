package com.example.a150119743hw1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        double bmiValue = intent.getDoubleExtra("BMI_RESULT", 0.0);

        TextView textViewResult = findViewById(R.id.textViewResult);
        textViewResult.setText("BMI: " + String.format("%.1f", bmiValue));

        String bmiType = findBmiType(bmiValue);
        textViewResult.append("\nType: " + bmiType);
    }

    private String findBmiType(double bmiValue) {
        if (bmiValue < 18.5) {
            return "Underweight";
        } else if (bmiValue >= 18.5 && bmiValue < 25.0) {
            return "Normal";
        } else if (bmiValue >= 25.0 && bmiValue < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
