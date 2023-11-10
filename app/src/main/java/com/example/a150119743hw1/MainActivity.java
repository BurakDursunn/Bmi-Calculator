package com.example.a150119743hw1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText heightTextEdit = findViewById(R.id.editTextHeight);
        final EditText weightTextEdit = findViewById(R.id.editTextWeight);
        Button buttonCalculate = findViewById(R.id.btnCalculate);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double parsedWeight = Double.parseDouble(weightTextEdit.getText().toString());
                double parsedHeight = Double.parseDouble(heightTextEdit.getText().toString());

                double bmi = parsedWeight/(parsedHeight*parsedHeight);

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("BMI_RESULT", bmi);
                startActivity(intent);
            }
        });
    }
}
