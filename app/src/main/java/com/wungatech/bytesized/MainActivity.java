package com.wungatech.bytesized;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valueToConvert;
    TextView result;
    Button tempButton;
    Button mediumDistance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valueToConvert = findViewById(R.id.valueToConvert);
        result = findViewById(R.id.convertedValue);
        tempButton = findViewById(R.id.temperature);
        mediumDistance = findViewById(R.id.mediumdistance);
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        FeetToMetersConverter feetToMetersConverter = new FeetToMetersConverter();
        tempButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(temperatureConverter.fahrenheitToCelsius(Double.parseDouble(valueToConvert.getText().toString()))));
            }
        });
        mediumDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(feetToMetersConverter.feetToMeters(Double.parseDouble(valueToConvert.getText().toString()))));
            }
        });
    }
}