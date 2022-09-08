package com.example.sumatoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
  EditText val;
  TextView res,res1,res2,res3,val1,val2,val3;
  Button btnSumar;
  Button Salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val=(EditText) findViewById(R.id.valor);
        val1=(TextView) findViewById(R.id.valor1);
        val2=(TextView) findViewById(R.id.valor2);
        val3=(TextView) findViewById(R.id.valor3);
        res=(TextView) findViewById(R.id.textview);
        res1=(TextView) findViewById(R.id.textview1);
        res2=(TextView) findViewById(R.id.textview2);
        res3=(TextView) findViewById(R.id.textview3);
        btnSumar=(Button) findViewById(R.id.Sumatoria);
        Salir=(Button) findViewById(R.id.salir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sumatoria();
            }
        });
        Salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                salir();
            }
        });
    }

    private void salir() {
        finish();

    }

    public void sumatoria(){
            double x,y;
            double r;


            x = Integer.parseInt(val.getText().toString());
            y = Integer.parseInt(val2.getText().toString());

            r= x*(x+1)/2;


            val3.setText(String.valueOf(r));

    }


}