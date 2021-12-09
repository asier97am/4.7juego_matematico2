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
    public ImageView KO, OK;

    public int aleatorio;
    String numeroAleatorio;

    public static boolean divisible2(int valorEntero) {
        return (valorEntero % 2 == 0);
    }
    public static boolean divisible3(int valorEntero) {
        return (valorEntero % 3 == 0);
    }
    public static boolean divisible5(int valorEntero) {
        return (valorEntero % 5 == 0);
    }
    public static boolean divisible10(int valorEntero) {
        return (valorEntero % 10 == 0);
    }
    public static boolean noDivisible(int valorEntero) {
        return ((valorEntero % 2 != 0)&&(valorEntero % 3 != 0)&&(valorEntero % 5 != 0)&&(valorEntero % 10 != 0));
    }

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

        KO = findViewById(R.id.KO);
        OK = findViewById(R.id.OK);

        btComprobar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean estadoChk1 = check_2.isChecked();
                boolean estadoChk2 = check_3.isChecked();
                boolean estadoChk3 = check_5.isChecked();
                boolean estadoChk4 = check_10.isChecked();
                boolean estadoChk5 = check_nodiv.isChecked();

                if((estadoChk1==false)&&(estadoChk2==false)&&(estadoChk3==false)&&(estadoChk4==false)&&(estadoChk5==false)){
                    Toast.makeText(MainActivity.this, "No es divisible entre ninguno", Toast.LENGTH_SHORT).show();
                }
                if((divisible2(aleatorio)==true) && (estadoChk1==true)) {
                    tvComprobacion.setText("Correcto");
                    OK.setVisibility(View.VISIBLE);
                    KO.setVisibility(View.INVISIBLE);
                }else if(((divisible2(aleatorio)==false) && (estadoChk1==true))||((divisible2(aleatorio)==true) && (estadoChk1==false))){
                    tvComprobacion.setText("Error");
                    KO.setVisibility(View.VISIBLE);
                    OK.setVisibility(View.INVISIBLE);
                }

                if((divisible3(aleatorio)==true) && (estadoChk2==true)) {
                    tvComprobacion.setText("Correcto");
                    OK.setVisibility(View.VISIBLE);
                    KO.setVisibility(View.INVISIBLE);
                }else if(((divisible3(aleatorio)==false) && (estadoChk2==true))||((divisible3(aleatorio)==true) && (estadoChk2==false))){
                    tvComprobacion.setText("Error");
                    KO.setVisibility(View.VISIBLE);
                    OK.setVisibility(View.INVISIBLE);
                }
                if((divisible5(aleatorio)==true) && (estadoChk3==true)) {
                    tvComprobacion.setText("Correcto");
                    OK.setVisibility(View.VISIBLE);
                    KO.setVisibility(View.INVISIBLE);
                }else if(((divisible5(aleatorio)==false) && (estadoChk3==true))||((divisible5(aleatorio)==true) && (estadoChk3==false))){
                    tvComprobacion.setText("Error");
                    KO.setVisibility(View.VISIBLE);
                    OK.setVisibility(View.INVISIBLE);
                }
                if((divisible10(aleatorio)==true) && (estadoChk4==true)) {
                    tvComprobacion.setText("Correcto");
                    OK.setVisibility(View.VISIBLE);
                    KO.setVisibility(View.INVISIBLE);
                }else if(((divisible10(aleatorio)==false) && (estadoChk4==true))||((divisible10(aleatorio)==true) && (estadoChk4==false))){
                    tvComprobacion.setText("Error");
                    KO.setVisibility(View.VISIBLE);
                    OK.setVisibility(View.INVISIBLE);
                }
                if((noDivisible(aleatorio)==true) && (estadoChk5==true)) {
                    Toast.makeText(MainActivity.this, "No es divisible entre ninguno", Toast.LENGTH_SHORT).show();
                    tvComprobacion.setText("Correcto");
                    OK.setVisibility(View.VISIBLE);
                    KO.setVisibility(View.INVISIBLE);
                }else if(((noDivisible(aleatorio)==false) && (estadoChk5==true))||((noDivisible(aleatorio)==true) && (estadoChk5==false))){
                    tvComprobacion.setText("Error");
                    KO.setVisibility(View.VISIBLE);
                    OK.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    public void btGenerarAleatorio(View view) {
        int min = 1;
        int max = 10;
        aleatorio = (int) (Math.random() * (max + 1 - min) + min);
        numeroAleatorio=String.valueOf(aleatorio);
        tvAlea.setText(numeroAleatorio);
    }
}