package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    AppCompatImageView estrela;
    AppCompatImageView faleconosco;

    AppCompatImageView menu_home;

    AppCompatImageView orquidea;

    AppCompatImageView espadadesaojorge;

    AppCompatImageView muda;

    AppCompatImageView cacto2;

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

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FaleConosco.class);
                startActivity(intent);
            }
        });

        menu_home = findViewById(R.id.iconmenu);

        menu_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, Meus_Favoritos.class);
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

        espadadesaojorge = findViewById(R.id.espadadesaojorge);

        espadadesaojorge.setOnClickListener(new View.OnClickListener() {
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

        muda = findViewById(R.id.muda);

        muda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Home.this, DescricaoMudas.class);
                startActivity(it);
            }
        });




    }
}