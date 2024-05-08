package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumberDecimal1;
    private EditText editTextNumberDecimal2;
    private EditText editTextNumberDecimal3;
    private EditText editTextNumberDecimal4;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editTextNumberDecimal1 = findViewById(R.id.editTextNumberDecimal1);
        editTextNumberDecimal2 = findViewById(R.id.editTextNumberDecimal2);
        editTextNumberDecimal3 = findViewById(R.id.editTextNumberDecimal3);
        editTextNumberDecimal4 = findViewById(R.id.editTextNumberDecimal4);

    }

    public void calculate(View view){
        DescriptiveStatistics statistics = new DescriptiveStatistics();
        statistics.addValue(Integer.valueOf(editTextNumberDecimal1.getText().toString()));
        statistics.addValue(Integer.valueOf(editTextNumberDecimal2.getText().toString()));
        statistics.addValue(Integer.valueOf(editTextNumberDecimal3.getText().toString()));
        statistics.addValue(Integer.valueOf(editTextNumberDecimal4.getText().toString()));

        button.setText(""+statistics.getMean());
    }
}
