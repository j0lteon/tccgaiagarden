package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Meus_Favoritos extends AppCompatActivity {

    AppCompatImageView imgfalecnsc;

    ImageView home;

    ImageView gaiagardenlogo;

    private TextView faleconosco;

    private TextView hometexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_meus_favoritos);

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Meus_Favoritos.this, FaleConosco.class);
                startActivity(it);
            }
        });

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Meus_Favoritos.this, FaleConosco.class);
                startActivity(intent);
            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Meus_Favoritos.this, FaleConosco.class);
                startActivity(it);
            }
        });

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Meus_Favoritos.this, Home.class);
                startActivity(it);
            }
        });

        hometexto = findViewById(R.id.hometexto);
        IniciarComponentes2();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Meus_Favoritos.this, Home.class);
                startActivity(it);
            }
        });

        Button button = findViewById(R.id.adicionar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Meus_Favoritos.this, Home.class);
                startActivity(it);
            }
        });

    }

    private void IniciarComponentes(){

        faleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        hometexto = findViewById(R.id.hometexto);
    }

}