package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DescricaoFlores extends AppCompatActivity {

    ImageView gaiagardenlogo;

    ImageView faleconosco;

    TextView textofaleconosco;

    AppCompatImageView perfil;

    TextView perfiltexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descricao_flores);

        perfil = findViewById(R.id.perfil);

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DescricaoFlores.this, Perfil.class);
                startActivity(it);
            }
        });

        perfiltexto = findViewById(R.id.perfiltexto);

        perfiltexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DescricaoFlores.this, Perfil.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(DescricaoFlores.this, FaleConosco.class);
                startActivity(it);
            }
        });

        textofaleconosco = findViewById(R.id.faleconosco);

        textofaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DescricaoFlores.this, FaleConosco.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(DescricaoFlores.this, Home.class);
                startActivity(it);
            }
        });


    }
}