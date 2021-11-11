package com.example.temparatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        Log.i("info", "Button Clicked!");
        EditText tempInFahrenheit = (EditText) findViewById(R.id.fahrenheitEditText);
        Log.i("values", tempInFahrenheit.getText().toString());
        double tempInFahrenheitDouble = Double.parseDouble(tempInFahrenheit.getText().toString());
        double tempInCelsiusDouble = (tempInFahrenheitDouble - 32) * 5/9;
        String tempInCelsiusString = String.format("%.2f", tempInCelsiusDouble);
        Toast.makeText(this, "Your temperature in celsius is "+ tempInCelsiusString, Toast.LENGTH_LONG).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}