
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

    ImageView faleconosco;

    TextView textoorquidea;

    TextView textofaleconosco;

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


        orquidea = findViewById(R.id.orquidea);

        orquidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flores.this, DescricaoFlores.class);
                startActivity(intent);
            }
        });

        textoorquidea = findViewById(R.id.textoorquidea);

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

        textofaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Flores.this, FaleConosco.class);
                startActivity(it);
            }
        });
    }

}