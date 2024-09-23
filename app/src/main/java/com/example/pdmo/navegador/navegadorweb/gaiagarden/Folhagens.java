package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Folhagens extends AppCompatActivity {

    AppCompatImageView espadadesaojorge;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    AppCompatImageView imgfalecncs;

    private TextView voltartexto;

    private TextView meusfavoritos;

    private TextView textoespada;

    private TextView faleconosco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_folhagens);

        espadadesaojorge = findViewById(R.id.espadadesaojorge);

        espadadesaojorge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, Descricao_Produto.class);
                startActivity(it);
            }
        });

        textoespada = findViewById(R.id.textoespada);
        IniciarComponentes3();

        textoespada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Folhagens.this, Descricao_Produto.class);
                startActivity(it);
            }
        });

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, Categorias.class);
                startActivity(it);
            }
        });

        voltartexto = findViewById(R.id.voltartexto);
        IniciarComponentes();
        voltartexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Folhagens.this, Cadastro.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes2();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Folhagens.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecncs = findViewById(R.id.imgfalecnsc);

        imgfalecncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, FaleConosco.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes4();
        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Folhagens.this, FaleConosco.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, Home.class);
                startActivity(it);
            }
        });

    }

    private void IniciarComponentes() {

        voltartexto = findViewById(R.id.voltartexto);
    }

    private void IniciarComponentes2() {

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }

    private void IniciarComponentes3() {

        textoespada = findViewById(R.id.textoespada);
    }

    private void IniciarComponentes4() {

        faleconosco = findViewById(R.id.faleconosco);
    }
}