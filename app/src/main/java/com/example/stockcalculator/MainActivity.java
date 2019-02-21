package com.example.stockcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText a;
    private EditText b;
    private EditText c;
    private EditText resultat;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

        a = findViewById(R.id.aTextView);
        b = findViewById(R.id.bTextView);
        c = findViewById(R.id.cTextView);
        resultat = findViewById(R.id.resultatTextView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // your handler code here

                String aStringVal  = (a.getText().toString());
                double aDoubleVal = Double.parseDouble(aStringVal);
                String bStringVal  = (b.getText().toString());
                double bDoubleVal = Double.parseDouble(bStringVal);
                String cStringVal  = (c.getText().toString());
                double cDoubleVal = Double.parseDouble(cStringVal);

                // TODO  sætter tallene i metoden og regner ud
                double resultatValue = Calculator.Breakeven(aDoubleVal,bDoubleVal,cDoubleVal);
                Log.d("hajmund", "Resultatet er " + resultatValue);

                // TODO  vis det i resultat
                resultat.setText(String.valueOf(resultatValue));

            }
        });
    }




}