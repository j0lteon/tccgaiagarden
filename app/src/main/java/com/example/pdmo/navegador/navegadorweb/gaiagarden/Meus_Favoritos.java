package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Meus_Favoritos extends AppCompatActivity {

    AppCompatImageView faleconosco;

    AppCompatImageView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_meus_favoritos);

        faleconosco = findViewById(R.id.imgfalecnsc);


        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Meus_Favoritos.this, FaleConosco.class);
                startActivity(intent);
            }
        });
    }
}