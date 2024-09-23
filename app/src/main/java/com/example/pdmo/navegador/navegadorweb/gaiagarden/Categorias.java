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

    AppCompatImageView estrela;

    AppCompatImageView faleconosco;

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

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Categorias.this, Meus_Favoritos.class);
                startActivity(intent);
            }
        });

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Categorias.this, FaleConosco.class);
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
                Intent it = new Intent(Categorias.this, Plantas.class);
                startActivity(it);
            }
        });

        cactos = findViewById(R.id.cactos);
        IniciarComponentes();

        cactos.setOnClickListener((View v) ->{
            Intent it = new Intent(Categorias.this, Cactos.class);
            startActivity(it);
        });

        flores = findViewById(R.id.flores);
        IniciarComponentes2();

        flores.setOnClickListener((View v) ->{
            Intent it = new Intent(Categorias.this, Flores.class);
            startActivity(it);
        });

        folhagens = findViewById(R.id.folhagens);
        IniciarComponentes3();

        folhagens.setOnClickListener((View v) ->{
            Intent it = new Intent(Categorias.this, Folhagens.class);
        });

    }
    private void IniciarComponentes(){
        cactos = findViewById(R.id.cactos);

    }
    private void IniciarComponentes2(){
        flores = findViewById(R.id.flores);
    }
}
    private void IniciarComponentes3(){
        flores = findViewById(R.id.folhagens);
    }
}