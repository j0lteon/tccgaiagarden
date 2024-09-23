package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mudas extends AppCompatActivity {

    AppCompatImageView muda;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    AppCompatImageView imgfalecncs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudas);

        muda = findViewById(R.id.muda);

        muda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Categorias.class);
                startActivity(it);
            }
        });

        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Home.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        imgfalecncs = findViewById(R.id.imgfalecnsc);

        imgfalecncs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, FaleConosco.class);

            }
        });


    }

}