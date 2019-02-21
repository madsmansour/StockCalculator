package com.example.stockcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText c;
    private EditText d;
    private EditText resultat;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        a = findViewById(R.id.aTextView);
        b = findViewById(R.id.bTextView);
        c = findViewById(R.id.cTextView);
        d = findViewById(R.id.dTextView);
        resultat = findViewById(R.id.resultatTextView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here
                // TODO træk a og b ud fra edittext

                String aStringVal  = (a.getText().toString());
                double aDoubleVal = Double.parseDouble(aStringVal);
                String bStringVal  = (b.getText().toString());
                double bDoubleVal = Double.parseDouble(bStringVal);
                String cStringVal  = (c.getText().toString());
                double cDoubleVal = Double.parseDouble(cStringVal);
                String dStringVal  = (d.getText().toString());
                double dDoubleVal = Double.parseDouble(dStringVal);

                // TODO  læg dem sammen
                double resultatValue = Calculator.ProfitCalc(aDoubleVal,bDoubleVal,cDoubleVal,dDoubleVal);
                Log.d("hajmund", "Resultatet er " + resultatValue);

                // TODO  vis det i resultat
                resultat.setText(String.valueOf(resultatValue));

            }
        });
    }




}