package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Home extends AppCompatActivity {


    AppCompatImageView faleconosco;

    AppCompatImageView menu_home;

    AppCompatImageView orquidea;

    AppCompatImageView espadadesaojorge;

    AppCompatImageView muda;

    AppCompatImageView cacto2;

    TextView categorias;

    AppCompatImageView perfil;

    TextView perfiltexto;

    TextView textofaleconosco;

    TextView textoorquidea;

    TextView textomuda;

    TextView textoespada;

    TextView textocacto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        perfil = findViewById(R.id.perfil);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Perfil.class);
                startActivity(it);
            }
        });

        perfiltexto = findViewById(R.id.perfiltexto);

        perfiltexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Perfil.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FaleConosco.class);
                startActivity(intent);
            }
        });

        textofaleconosco = findViewById(R.id.faleconosco);
        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, FaleConosco.class);
                startActivity(it);
            }
        });

        menu_home = findViewById(R.id.iconmenu);

        menu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, Categorias.class);
                startActivity(it);
            }
        });

        categorias = findViewById(R.id.categorias);
        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Categorias.class);
                startActivity(it);
            }
        });

        orquidea = findViewById(R.id.orquidea);

        orquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, DescricaoFlores.class);
                startActivity(it);
            }
        });

        textoorquidea = findViewById(R.id.textoorquidea);

        textoorquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, DescricaoFlores.class);
                startActivity(it);
            }
        });

        espadadesaojorge = findViewById(R.id.espadadesaojorge);

        espadadesaojorge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, Descricao_Produto.class);
                startActivity(it);
            }
        });

        textoespada = findViewById(R.id.textoespada);

        textoespada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Descricao_Produto.class);
                startActivity(it);
            }
        });

        cacto2 = findViewById(R.id.cacto2);

        cacto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, DescricaoCactos.class);
                startActivity(it);
            }
        });

        textocacto2 = findViewById(R.id.textocacto2);

        textocacto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, DescricaoCactos.class);
                startActivity(it);
            }
        });

        muda = findViewById(R.id.muda);

        muda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

        textomuda = findViewById(R.id.textomuda);
        textomuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

    }

}