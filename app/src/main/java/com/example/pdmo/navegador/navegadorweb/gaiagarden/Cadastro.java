package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class Cadastro extends AppCompatActivity {

    ImageView seta;


    private TextView voltar;

    EditText edit_email, edit_senha, edit_nome, edit_tell;
    Button btnInserir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);


        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_tell = (EditText) findViewById(R.id.edit_tell);
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_senha = (EditText) findViewById(R.id.edit_senha);
        btnInserir = (Button) findViewById(R.id.cadastrar);

        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario user = new Usuario(
                        edit_nome.getText().toString(),
                        edit_email.getText().toString(),
                        edit_senha.getText().toString(),
                        "USER_APP",
                        edit_tell.getText().toString(),
                        LocalDate.now(),
                        "ATIVO"
                );

                int res = UsuarioDao.inserirUsuario(user, getBaseContext());
                if (res <= 0) {
                    Snackbar.make(btnInserir, "Inserção não realizada!", Snackbar.LENGTH_LONG).show();
                }

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
