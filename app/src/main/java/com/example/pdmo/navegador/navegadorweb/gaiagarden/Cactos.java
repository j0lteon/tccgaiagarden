package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cactos extends AppCompatActivity {

    AppCompatImageView cacto2;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    AppCompatImageView imgfalecnsc;

    private TextView faleconosco;

    private TextView textocacto2;

    private TextView voltartexto;

    private TextView meusfavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactos);

        cacto2 = findViewById(R.id.cacto2);

        cacto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Cactos.this, DescricaoCactos.class);
                startActivity(it);
            }
        });

        textocacto2 = findViewById(R.id.textocacto2);
        IniciarComponentes2();

        textocacto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cactos.this, DescricaoCactos.class);
                startActivity(it);
            }
        });

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Cactos.this, Categorias.class);
                startActivity(it);
            }
        });

        voltartexto = findViewById(R.id.voltartexto);
        IniciarComponentes3();

        voltartexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cactos.this, Categorias.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Cactos.this, Home.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Cactos.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes4();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cactos.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Cactos.this, FaleConosco.class);
                startActivity(it);

            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Cactos.this, FaleConosco.class);
                startActivity(it);
            }
        });


    }

    private void IniciarComponentes(){

        faleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        textocacto2 = findViewById(R.id.textocacto2);
    }

    private void IniciarComponentes3(){

        voltartexto = findViewById(R.id.voltartexto);
    }

    private void IniciarComponentes4(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }
}