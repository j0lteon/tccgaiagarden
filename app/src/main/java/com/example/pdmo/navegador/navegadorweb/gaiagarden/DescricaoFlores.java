package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DescricaoFlores extends AppCompatActivity {

    AppCompatImageView estrela;

    ImageView gaiagardenlogo;

    AppCompatImageView imgfalecnsc;

    ImageView home;


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

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

        Button addfav = findViewById(R.id.addfav);

        addfav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it =  new Intent(DescricaoFlores.this, Meus_Favoritos.class);
                startActivity(it);

            }
        });

    }
}