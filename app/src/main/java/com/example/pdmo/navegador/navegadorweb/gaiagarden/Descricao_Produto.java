package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Descricao_Produto extends AppCompatActivity {

    AppCompatImageView estrela;

    AppCompatImageView faleconosco;

    ImageView home;

    ImageView gaiagardenlogo;

    private TextView textofaleconosco;

    private TextView hometexto;

    private TextView meusfavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_produto);

        Button button = findViewById(R.id.addfav);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Descricao_Produto.this, Meus_Favoritos.class);
                startActivity(it);
            }

        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes3();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Descricao_Produto.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, FaleConosco.class);
                startActivity(it);
            }
        });

        textofaleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        textofaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Descricao_Produto.this, FaleConosco.class);
                startActivity(it);
            }
        });

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, Home.class);
                startActivity(it);
            }
        });

        hometexto = findViewById(R.id.hometexto);
        IniciarComponentes2();

        hometexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Descricao_Produto.this, Home.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, Home.class);
                startActivity(it);
            }
        });

        Button addfav = findViewById(R.id.addfav);

            addfav.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it =  new Intent(Descricao_Produto.this, Meus_Favoritos.class);
                    startActivity(it);

                }

            });
        }

    private void IniciarComponentes(){

        textofaleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        hometexto = findViewById(R.id.hometexto);
    }

    private void IniciarComponentes3(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }
}


