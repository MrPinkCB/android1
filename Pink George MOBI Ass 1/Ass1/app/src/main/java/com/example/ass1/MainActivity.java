package com.example.ass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Variable names for calculating temp conversion
    double fahrenheit;
    //Variable Names of my edit text/textview
    EditText a, b;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EditText) findViewById(R.id.editTextName);
        b = (EditText) findViewById(R.id.editTextTemp);
        tv = (TextView) findViewById(R.id.textViewResults);
        Button b =(Button) findViewById(R.id.button);
        b.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String name = a.getText().toString();
        String temp = b.getText().toString();
        fahrenheit = Double.parseDouble(String.valueOf(b.getText()));
        double test=fahrenheit*1.8+32;
        String r = String.valueOf(test);
        tv.setText("Name:\t" + name + "\n\nTemp converted to Fahrenheit:\t" + r);

    }
}