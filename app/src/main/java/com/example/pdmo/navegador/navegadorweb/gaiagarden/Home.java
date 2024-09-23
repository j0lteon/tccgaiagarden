package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    AppCompatImageView estrela;
    AppCompatImageView imgfalecnsc;

    AppCompatImageView menu_home;

    AppCompatImageView orquidea;

    AppCompatImageView espadadesaojorge;

    AppCompatImageView muda;

    AppCompatImageView cacto2;

    private TextView categorias;

    private  TextView meusfavoritos;

    private TextView faleconosco;

    private TextView textoorquidea;

    private TextView textomuda;

    private TextView textoespada;

    private TextView textocacto2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);


        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Home.this, Meus_Favoritos.class);
                startActivity(intent);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes2();
        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecnsc = findViewById(R.id.imgfalecnsc);

        imgfalecnsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FaleConosco.class);
                startActivity(intent);
            }
        });

        faleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes3();
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
        IniciarComponentes();
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
        IniciarComponentes4();

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
        IniciarComponentes6();
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
        IniciarComponentes7();

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

        textomuda = findViewById(R.id.muda);
        IniciarComponente5();
        textomuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Home.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

    }

    private void IniciarComponentes(){
        categorias = findViewById(R.id.categorias);
    }

    private void IniciarComponentes2() {

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }

    private void IniciarComponentes3() {

        faleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes4() {

        textoorquidea = findViewById(R.id.textoorquidea);
    }

    private void IniciarComponente5() {

        textomuda = findViewById(R.id.textomuda);
    }

    private void IniciarComponentes6() {

        textoespada = findViewById(R.id.textoespada);
    }

    private void IniciarComponentes7() {

        textocacto2 = findViewById(R.id.textocacto2);
    }
}