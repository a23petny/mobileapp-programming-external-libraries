package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DescriptiveStatistics statistics = new DescriptiveStatistics();
    }
}
