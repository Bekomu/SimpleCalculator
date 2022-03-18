package com.berkayozisik.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1Text;
    EditText sayi2Text;
    TextView sonucText;
    Button topla;
    Button cikart;
    Button carp;
    Button bol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1Text = findViewById(R.id.txtIlkSayi);
        sayi2Text = findViewById(R.id.txtIkinciSayi);
        sonucText = findViewById(R.id.lblSonuc);
        topla = findViewById(R.id.btnTopla);
        cikart = findViewById(R.id.btnCikart);
        carp = findViewById(R.id.btnCarp);
        bol = findViewById(R.id.btnBol);

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sayi1Text.getText().toString().matches("") || sayi2Text.getText().toString().matches(""))                 // ÖNEMLİ
                {
                    sonucText.setText("Değer girin");
                }
                else {
                    int sayia = Integer.parseInt(sayi1Text.getText().toString());
                    int sayib = Integer.parseInt(sayi2Text.getText().toString());

                    int result = sayia + sayib;
                    sonucText.setText(" " + result + " ");
                }

            }
        });
        cikart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sayi1Text.getText().toString().matches("") || sayi2Text.getText().toString().matches(""))                 // ÖNEMLİ
                {
                    sonucText.setText("Değer girin");
                }
                else {
                int sayia = Integer.parseInt(sayi1Text.getText().toString());
                int sayib = Integer.parseInt(sayi2Text.getText().toString());

                int result = sayia - sayib;
                sonucText.setText(" " + result + " ");}
            }
        });
        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sayi1Text.getText().toString().matches("") || sayi2Text.getText().toString().matches(""))                 // ÖNEMLİ
                {
                    sonucText.setText("Değer girin");
                }
                else {
                int sayia = Integer.parseInt(sayi1Text.getText().toString());
                int sayib = Integer.parseInt(sayi2Text.getText().toString());

                int result = sayia * sayib;
                sonucText.setText(" " + result + " ");}
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sayi1Text.getText().toString().matches("") || sayi2Text.getText().toString().matches(""))                 // ÖNEMLİ
                {
                    sonucText.setText("Değer girin");
                }
                else {
                int sayia = Integer.parseInt(sayi1Text.getText().toString());
                int sayib = Integer.parseInt(sayi2Text.getText().toString());

                int result = sayia / sayib;
                sonucText.setText(" " + result + " ");}
            }
        });
    }

}