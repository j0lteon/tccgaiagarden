
package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Flores extends AppCompatActivity {

    ImageView orquidea;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    ImageView faleconosco;

    private TextView voltartexto;

    private TextView meusfavoritos;

    private TextView textoorquidea;

    private TextView textofaleconosco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flores);

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, Home.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes3();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, Categorias.class);
                startActivity(it);
            }
        });

        voltartexto = findViewById(R.id.voltartexto);
        IniciarComponentes2();

        voltartexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, Categorias.class);
                startActivity(it);
            }
        });

        orquidea = findViewById(R.id.orquidea);

        orquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flores.this, DescricaoFlores.class);
                startActivity(intent);
            }
        });

        textoorquidea = findViewById(R.id.textoorquidea);
        IniciarComponentes4();

        textoorquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, DescricaoFlores.class);
                startActivity(it);
            }
        });


        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, FaleConosco.class);
                startActivity(it);
            }
        });

        textofaleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        textofaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, FaleConosco.class);
                startActivity(it);
            }
        });
    }

    private void IniciarComponentes(){

        textofaleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        voltartexto = findViewById(R.id.voltartexto);
    }

    private void IniciarComponentes3(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }

    private void IniciarComponentes4(){

        textoorquidea = findViewById(R.id.textoorquidea);
    }
}