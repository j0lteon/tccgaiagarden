package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DescricaoMudas extends AppCompatActivity {

    ImageView estrela;

    ImageView gaiagardenlogo;

    ImageView imgfalecnsc;

    ImageView home;

    private TextView faleconosco;

    private TextView hometexto;

    private TextView meusfavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoMudas.this, Home.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoMudas.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes3();
        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoMudas.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoMudas.this, FaleConosco.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoMudas.this, FaleConosco.class);
                startActivity(it);
            }
        });

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoMudas.this, Home.class);
                startActivity(it);
            }
        });

        hometexto = findViewById(R.id.hometexto);
        IniciarComponentes2();

        hometexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoMudas.this, Home.class);
                startActivity(it);
            }
        });
/*
        Button addfav = findViewById(R.id.addfav);

        addfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =  new Intent(DescricaoMudas.this, Meus_Favoritos.class);
                startActivity(it);

            }
        }); */


    }
    private void IniciarComponentes(){

        faleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        hometexto = findViewById(R.id.hometexto);
    }

    private void IniciarComponentes3(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }
}