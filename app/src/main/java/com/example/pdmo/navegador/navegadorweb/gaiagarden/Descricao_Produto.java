package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Descricao_Produto extends AppCompatActivity {

    AppCompatImageView estrela;

    AppCompatImageView faleconosco;

    AppCompatImageView home;


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

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, FaleConosco.class);
                startActivity(it);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Descricao_Produto.this, Home.class);
                startActivity(it);
            }
        });

    }

}

