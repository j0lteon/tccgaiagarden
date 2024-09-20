
package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Flores extends AppCompatActivity {

    AppCompatImageView florroxa;

    AppCompatImageView muda;

    AppCompatImageView anturio;

    AppCompatImageView liriobranco;

    AppCompatImageView rosas;

    AppCompatImageView azaleias;

    AppCompatImageView copodeleite;

    AppCompatImageView margaridas;

    AppCompatImageView cravo;

    AppCompatImageView girassol;

    AppCompatImageView liriolaranja;

    AppCompatImageView bromelia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flores);

        muda      =  findViewById(R.id.orquidea);

        muda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Flores.this, DescricaoFlores.class);
                startActivity(intent);
            }
        });

    }
}