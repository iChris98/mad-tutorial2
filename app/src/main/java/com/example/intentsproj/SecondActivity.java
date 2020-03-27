package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.i("Lifecycle", "OnCreate() Invoked");

        EditText no1 = (EditText)findViewById(R.id.editText3);
        EditText no2 = (EditText)findViewById(R.id.editText4);

        no1.setText(getIntent().getExtras().getString("number1"));
        no2.setText(getIntent().getExtras().getString("number2"));


    }
    //Add button functions goes here

    public void onButtonAdd(View v){
        EditText no1 = (EditText)findViewById(R.id.editText3);
        EditText no2 = (EditText)findViewById(R.id.editText4);

        TextView textView = (TextView)findViewById(R.id.resultText);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float total = (number1 + number2);

        textView.setText(Float.toString(number1)+" "+"+"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(total));
    }

    //subtraction function goes here

    public void onButtonSub(View v){
        EditText no1 = (EditText)findViewById(R.id.editText3);
        EditText no2 = (EditText)findViewById(R.id.editText4);

        TextView textView = (TextView)findViewById(R.id.resultText);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float subtraction = (number1 - number2);

        textView.setText(Float.toString(number1)+" "+"-"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(subtraction));
    }

    //multiple function goes here

    public void onButtonMul(View v){
        EditText no1 = (EditText)findViewById(R.id.editText3);
        EditText no2 = (EditText)findViewById(R.id.editText4);

        TextView textView = (TextView)findViewById(R.id.resultText);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float multiply = (number1 * number2);

        textView.setText(Float.toString(number1)+" "+"x"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(multiply));

    }

    //division function goes here

    public void onButtonDiv(View v) {
        EditText no1 = (EditText) findViewById(R.id.editText3);
        EditText no2 = (EditText) findViewById(R.id.editText4);

        TextView textView = (TextView) findViewById(R.id.resultText);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float division = number1 / number2;

        textView.setText(Float.toString(number1) + " " + "/" + " " + Float.toString(number2) + " " + "=" + " " + Float.toString(division));

    }

    }

