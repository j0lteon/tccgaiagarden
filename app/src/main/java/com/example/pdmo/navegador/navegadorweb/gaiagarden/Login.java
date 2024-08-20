package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button  botao = findViewById(R.id.entrar);

        botao.setOnClickListener((view) -> {
            Intent intent = new Intent(this, Home.class);
            startActivity(intent);
        });
    }
}