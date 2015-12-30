package com.example.admin.m;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t,t1;
    TextView t2;

    float num1=0;
    float num2=0; double result=0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t= (EditText) findViewById(R.id.editText2);
        t1= (EditText) findViewById(R.id.editText);
        t2 = (TextView) findViewById(R.id.textView2);
    }


    public void Addkrdo(View v){
        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;

        }
        else {
            num1 = Float.parseFloat(t.getText().toString());
            num2= Float.parseFloat(t1.getText().toString());
            result = num1+num2;String s=Double.toString(result);
            t2.setText(s);}

    }

    public void Mddkrdo(View v1){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Float.parseFloat(t.getText().toString());
            num2= Float.parseFloat(t1.getText().toString());
            result = num1 - num2;String s=Double.toString(result);
            t2.setText(s);
        }

    }
    public void Muddkrdo(View v2){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Float.parseFloat(t.getText().toString());
            num2= Float.parseFloat(t1.getText().toString());
            result = num1 * num2;String s=Double.toString(result);
            t2.setText(s);
        }


    }
    public void Dddkrdo(View v3){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Float.parseFloat(t.getText().toString());
            num2= Float.parseFloat(t1.getText().toString());
            result = num1 / num2;String s=Double.toString(result);
            t2.setText(s);
        }
    }





    public void Clr(View v){

        result=0.0;num1=0;num2=0;

        t.setText("");
        t1.setText("");
        t2.setText("");
    }
}

