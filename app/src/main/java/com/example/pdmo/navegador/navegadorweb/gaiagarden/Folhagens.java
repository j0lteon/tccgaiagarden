package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Folhagens extends AppCompatActivity {

    AppCompatImageView espadadesaojorge;

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

    }
}