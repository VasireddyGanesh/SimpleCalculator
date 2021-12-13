package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1,number2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);

        res=findViewById(R.id.result);
    }

    public void add(View view) {
        if(!(number1.getText().toString().equals("")) && !(number2.getText().toString().equals(""))){
            int n1=Integer.parseInt(String.valueOf(number1.getText()));
            int n2=Integer.parseInt(String.valueOf(number2.getText()));
            res.setText(Integer.toString(n1+n2));
        }
    }

    public void multiply(View view) {
        if(!(number1.getText().toString().equals("")) && !(number2.getText().toString().equals(""))){
            int n1=Integer.parseInt(String.valueOf(number1.getText()));
            int n2=Integer.parseInt(String.valueOf(number2.getText()));
            res.setText(Integer.toString(n1*n2));
        }
    }

    public void minus(View view) {
        if(!(number1.getText().toString().equals("")) && !(number2.getText().toString().equals(""))){
            int n1=Integer.parseInt(String.valueOf(number1.getText()));
            int n2=Integer.parseInt(String.valueOf(number2.getText()));
            res.setText(Integer.toString(n1-n2));
        }
    }
}