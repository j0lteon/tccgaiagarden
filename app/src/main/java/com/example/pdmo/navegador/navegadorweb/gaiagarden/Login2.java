package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login2 extends AppCompatActivity {



    private TextView cadastrese;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        Button button = findViewById(R.id.entrar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login2.this, Home.class);
                startActivity(it);
            }
        });

        cadastrese = findViewById(R.id.cadastrese);
        IniciarComponentes();

        cadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login2.this, Cadastro.class);
                startActivity(it);
            }
        });
    }

    private void IniciarComponentes() {

        cadastrese = findViewById(R.id.cadastrese);
    }
}