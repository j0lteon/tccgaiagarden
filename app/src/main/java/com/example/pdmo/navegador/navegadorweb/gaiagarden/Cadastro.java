package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {

    ImageView seta;

    private TextView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button button = findViewById(R.id.cadastrar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Home.class);
                startActivity(it);
            }
        });


        seta = findViewById(R.id.imageView2);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Login2.class);
                startActivity(it);
            }
        });

        voltar = findViewById(R.id.voltar);
        IniciarComponentes();

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Cadastro.this, Login2.class);
                startActivity(it);
            }
        });

    }

    private void IniciarComponentes() {

        voltar = findViewById(R.id.voltar);
    }

}
