package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DescricaoFlores extends AppCompatActivity {

    AppCompatImageView estrela;

    ImageView gaiagardenlogo;

    AppCompatImageView imgfalecnsc;

    ImageView home;


    private TextView faleconosco;

    private TextView voltartexto;

    private TextView meusfavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_flores);

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoFlores.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes3();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoFlores.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DescricaoFlores.this, FaleConosco.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoFlores.this, FaleConosco.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoFlores.this, Home.class);

            }
        });

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoFlores.this, Home.class);
                startActivity(it);
            }
        });

        voltartexto = findViewById(R.id.voltartexto);
        IniciarComponentes2();

        voltartexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoFlores.this, Home.class);
                startActivity(it);
            }
        });

        Button addfav = findViewById(R.id.addfav);

        addfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =  new Intent(DescricaoFlores.this, Meus_Favoritos.class);
                startActivity(it);

            }
        });

    }
    private void IniciarComponentes(){

        faleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        voltartexto = findViewById(R.id.voltartexto);
    }

    private void IniciarComponentes3(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }
}