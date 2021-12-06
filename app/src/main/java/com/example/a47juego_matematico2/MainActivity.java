package com.example.a47juego_matematico2;

import static com.example.a47juego_matematico2.R.id.viewComp;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btComprobar, btGenerarAleatorio;
    public CheckBox check_2, check_3, check_5, check_10, check_nodiv;
    public TextView tvAlea, tvComprobacion;
    public ImageView KO,OK;

    public int aleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAlea = (TextView) findViewById(R.id.tvAlea);
        tvComprobacion = findViewById(R.id.tvComprobacion);

        btGenerarAleatorio = findViewById(R.id.btGenerarAleatorio);
        btComprobar = (Button) findViewById(R.id.btComprobar);

        check_2 = findViewById(R.id.check_2);
        check_3 = findViewById(R.id.check_3);
        check_5 = findViewById(R.id.check_5);
        check_10 = findViewById(R.id.check_10);
        check_nodiv = findViewById(R.id.check_nodiv);

        KO=findViewById(R.id.KO);
        OK=findViewById(R.id.OK);


    }

    public void btGenerarAleatorio(View view) {
        int min = 1000;
        int max = 2000;
        aleatorio = (int) (Math.random() * (max + 1 - min) + min);
        tvAlea.setText("" + aleatorio);

    }

    public void btcomprobar(View view) {

        int aleatorio = Integer.parseInt(String.valueOf(tvAlea.getText()));


        boolean esDivisible;
        if (aleatorio % 2 == 0 || aleatorio % 3 == 0 || aleatorio % 5 == 0 || aleatorio % 10 == 0) {
            esDivisible = true;
        } else {
            esDivisible = false;
            Toast.makeText(this, "no es divisible por ninguno", Toast.LENGTH_SHORT).show();
        }

        if (!check_nodiv.isChecked() && !check_2.isChecked() && !check_3.isChecked() && !check_5.isChecked() && !check_10.isChecked()) {
            Toast.makeText(this, "Debe escoger una de las opciones", Toast.LENGTH_SHORT).show();
        } else {
            if (check_nodiv.isChecked() && esDivisible == false) {
                tvComprobacion.setText("Correcto");
                tvComprobacion.setTextColor(Color.GREEN);
                OK.setVisibility(View.VISIBLE);
                KO.setVisibility(View.INVISIBLE);
            } else {
                tvComprobacion.setText("ERROR");
                tvComprobacion.setTextColor(Color.RED);
                OK.setVisibility(View.INVISIBLE);
                KO.setVisibility(View.VISIBLE);
            }
            if (check_2.isChecked() && esDivisible == true) {
                tvComprobacion.setText("Correcto");
                tvComprobacion.setTextColor(Color.GREEN);
                OK.setVisibility(View.VISIBLE);
                KO.setVisibility(View.INVISIBLE);
            } else {
                tvComprobacion.setText("ERROR");
                tvComprobacion.setTextColor(Color.RED);
                OK.setVisibility(View.INVISIBLE);
                KO.setVisibility(View.VISIBLE);
            }
            if (check_3.isChecked() && esDivisible == true) {
                tvComprobacion.setText("Correcto");
                tvComprobacion.setTextColor(Color.GREEN);
                OK.setVisibility(View.VISIBLE);
                KO.setVisibility(View.INVISIBLE);
            } else {
                tvComprobacion.setText("ERROR");
                tvComprobacion.setTextColor(Color.RED);
                OK.setVisibility(View.INVISIBLE);
                KO.setVisibility(View.VISIBLE);
            }
            if (check_5.isChecked() && esDivisible == true) {
                tvComprobacion.setText("Correcto");
                tvComprobacion.setTextColor(Color.GREEN);
                OK.setVisibility(View.VISIBLE);
                KO.setVisibility(View.INVISIBLE);
            } else {
                tvComprobacion.setText("ERROR");
                tvComprobacion.setTextColor(Color.RED);
                OK.setVisibility(View.INVISIBLE);
                KO.setVisibility(View.VISIBLE);
            }
            if (check_10.isChecked() && esDivisible == true) {
                tvComprobacion.setText("Correcto");
                tvComprobacion.setTextColor(Color.GREEN);
                OK.setVisibility(View.VISIBLE);
                KO.setVisibility(View.INVISIBLE);
            } else {
                tvComprobacion.setText("ERROR");
                tvComprobacion.setTextColor(Color.RED);
                OK.setVisibility(View.INVISIBLE);
                KO.setVisibility(View.VISIBLE);
            }
        }
    }

    public void mostrarKO(View view) {
        OK.setVisibility(View.INVISIBLE);
        KO.setVisibility(View.VISIBLE);
    }
    public void mostrarOK(View view) {
        KO.setVisibility(View.INVISIBLE);
        OK.setVisibility(View.VISIBLE);
    }
}