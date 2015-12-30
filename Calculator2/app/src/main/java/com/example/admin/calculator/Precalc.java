package com.example.admin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Precalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    EditText t = (EditText) findViewById(R.id.editText2);
    EditText t1 = (EditText) findViewById(R.id.editText);


    /*

        Button one = (Button) findViewById(R.id.button8);
        Button two = (Button) findViewById(R.id.button7);
        Button three = (Button) findViewById(R.id.button6);
        Button four = (Button) findViewById(R.id.button11);
        Button five = (Button) findViewById(R.id.button10);
        Button six = (Button) findViewById(R.id.button9);
        Button seven = (Button) findViewById(R.id.button12);
        Button eight = (Button) findViewById(R.id.button13);
        Button nine = (Button) findViewById(R.id.button14);
        Button zero = (Button) findViewById(R.id.button15);


    */
    int num1 = 0;
    int num2 = 0;
    int result = 0;





    public void Addkrdo(View v){
        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;

        }
        else {
            num1 = Integer.parseInt(t.getText().toString());
            num2 = Integer.parseInt(t1.getText().toString());
            result = num1+num2;}

    }

    public void Mddkrdo(View v1){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Integer.parseInt(t.getText().toString());
            num2 = Integer.parseInt(t1.getText().toString());
            result = num1 - num2;
        }

    }
    public void Muddkrdo(View v2){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Integer.parseInt(t.getText().toString());
            num2 = Integer.parseInt(t1.getText().toString());
            result = num1 * num2;
        }


    }
    public void Dddkrdo(View v3){

        if (TextUtils.isEmpty(t.getText().toString())
                || TextUtils.isEmpty(t1.getText().toString())) {
            return;
        }
        else {
            num1 = Integer.parseInt(t.getText().toString());
            num2 = Integer.parseInt(t1.getText().toString());
            result = num1 / num2;
        }
    }



    public void Yo(View v4) {
        //final TextView t2 = (TextView) findViewById(R.id.editText3);
        TextView t2 = (TextView) findViewById(R.id.editText3);
        t2.setText(result);

    }

}
