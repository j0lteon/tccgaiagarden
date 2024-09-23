package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Folhagens extends AppCompatActivity {

    AppCompatImageView espadadesaojorge;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    AppCompatImageView faleconosco;

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

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Folhagens.this, Categorias.class);
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

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
}