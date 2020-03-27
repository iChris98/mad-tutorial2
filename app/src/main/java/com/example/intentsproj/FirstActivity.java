package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        final EditText firstNo1 = (EditText)findViewById(R.id.editText1);
        final EditText secondNo2 = (EditText)findViewById(R.id.editText2);

        okButton = (Button) findViewById(R.id.button1);
        okButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String num1 = firstNo1.getText().toString();
                String num2 = secondNo2.getText().toString();

                    Intent intent = new Intent(FirstActivity.this, MainActivity.class);
                    Context context = getApplicationContext();

                    CharSequence message = "You just clicked the OK button";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, message, duration);
                    toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL, 0, 25);

                    toast.show();
                    openSecondActivity();

            }
        }
    );
}
    public void openSecondActivity(){
        final EditText firstNo1 = (EditText)findViewById(R.id.editText1);
        final EditText secondNo2 = (EditText)findViewById(R.id.editText2);

        String number1 = firstNo1.getText().toString();
        String number2 = secondNo2.getText().toString();

        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

        intent.putExtra("number1",firstNo1.getText().toString());
        intent.putExtra("number2",secondNo2.getText().toString());

        startActivity(intent);
    }

}

