package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login2 extends AppCompatActivity {

    private EditText email, senha;
    private Button btnLogar;
    private String usu, sen;
    private int nivel = 9;

    TextView cadastrese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        inicializarComponentes();

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Login objL = Conexao.pesquisarLogin(
                        email.getText().toString(),
                        senha.getText().toString(),
                        getBaseContext()
                );
                if (objL != null) {
                    Intent it = new Intent(getBaseContext(), Home.class);
                    startActivity(it);
                } else {
                    Toast.makeText(getApplicationContext(), "E-mail ou senha inválidos!", Toast.LENGTH_LONG).show();
                }
            }
        });

        cadastrese = findViewById(R.id.cadastrese);

        cadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login2.this, Cadastro.class);
                startActivity(it);
            }
        });
    }

    private void inicializarComponentes() {
        email = findViewById(R.id.edit_email);
        senha = findViewById(R.id.edit_senha);
        btnLogar = findViewById(R.id.entrar);
    }

}