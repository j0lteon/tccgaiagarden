package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Categorias extends AppCompatActivity {

    ImageView categoriacacto;

    ImageView categoriaflores;

    ImageView categoriamudas;

    ImageView categoriaplantas;

    ImageView home;

    ImageView gaiagardenlogo;

    private TextView cactos;

    private TextView flores;

    private TextView folhagens;

    private TextView mudas;

    private TextView hometexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Home.class);
                startActivity(it);
            }
        });

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Home.class);
                startActivity(it);
            }
        });

        hometexto = findViewById(R.id.hometexto);

        hometexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Home.class);
                startActivity(it);
            }
        });



        categoriacacto = findViewById(R.id.categoriacactos);

        categoriacacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Cactos.class);
                startActivity(it);
            }
        });

        categoriaflores = findViewById(R.id.categoriaflor);

        categoriaflores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Flores.class);
                startActivity(it);
            }
        });

        categoriamudas = findViewById(R.id.categoriamudas);

        categoriamudas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Mudas.class);
                startActivity(it);
            }
        });

        categoriaplantas = findViewById(R.id.categoriafolhagens);

        categoriaplantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Folhagens.class);
                startActivity(it);
            }
        });

        cactos = findViewById(R.id.cactos);

        cactos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Cactos.class);
                startActivity(it);
            }
        });

        flores = findViewById(R.id.flores);

        flores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Flores.class);
                startActivity(it);
            }
        });

        folhagens = findViewById(R.id.folhagens);

        folhagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Folhagens.class);
                startActivity(it);
            }
        });

        mudas = findViewById(R.id.mudas);

        mudas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, Mudas.class);
                startActivity(it);
            }
        });

    }

}
