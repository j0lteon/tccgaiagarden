package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        Button botao = findViewById(R.id.categoriaplantas);

        botao.setOnClickListener((view) -> {
                    Intent intent = new Intent(this, Plantas.class);
                    startActivity(intent);
                });
    }
}