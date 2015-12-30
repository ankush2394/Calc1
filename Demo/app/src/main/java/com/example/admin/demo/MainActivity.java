package com.example.admin.demo;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
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

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // ATTENTION: This was auto-generated to implement the App Indexing API.

    }


    EditText t = (EditText) findViewById(R.id.editText2);
    EditText t1 = (EditText) findViewById(R.id.editText);
    Button btnAdd = (Button) findViewById(R.id.button);
    Button btnSub = (Button) findViewById(R.id.button2);
    Button btnMult = (Button) findViewById(R.id.button3);
    Button btnDiv = (Button) findViewById(R.id.button4);
    Button btnEqual = (Button) findViewById(R.id.button5);





       public float num1 = 0;
       public float num2 = 0;
       static float result = 0;


        public void Addkrdo(View v){

            num1 = Float.parseFloat(t.getText().toString());
            num2 = Float.parseFloat(t1.getText().toString());
            result = num1+num2;

    }
    public void Mddkrdo(View v1){

        num1 = Float.parseFloat(t.getText().toString());
        num2 = Float.parseFloat(t1.getText().toString());
        result = num1-num2;


    }
    public void Muddkrdo(View v2){

        num1 = Float.parseFloat(t.getText().toString());
        num2 = Float.parseFloat(t1.getText().toString());
        result = num1*num2;

    }
    public void Dddkrdo(View v3){

        num1 = Float.parseFloat(t.getText().toString());
        num2 = Float.parseFloat(t1.getText().toString());
        result = num1/num2;
    }

    final TextView t2 = (TextView) findViewById(R.id.editText3);

    public void Yo(View v4) {
        //final TextView t2 = (TextView) findViewById(R.id.editText3);
        t2.setText((int) result);

    }
}
