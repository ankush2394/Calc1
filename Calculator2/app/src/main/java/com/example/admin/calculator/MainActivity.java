package com.example.admin.Calculator;

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

public class MainActivity extends AppCompatActivity {

    EditText t,t1,t2;
   /*
   h-ashi
   a-priya
   p-ankita
   p-shelly
   y-jayant
   b-abhinav soni
   d-siyanshi
   a-
   y-
   ANKUSH
    */
    int num1 = 0;
    int num2 = 0;
    int result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        t= (EditText) findViewById(R.id.editText2);
        t1= (EditText) findViewById(R.id.editText);
        t2 = (EditText) findViewById(R.id.editText3);
    }


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

        t2.setText(result);

    }

}
}
