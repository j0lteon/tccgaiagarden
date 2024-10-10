package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
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

import kotlin.text.Regex;

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

                //todo - validações

                String nome = edit_nome.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();
                String telefone = edit_tell.getText().toString();


                if (nome.isEmpty() || nome.equals("")) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM NOME",
                            Toast.LENGTH_SHORT).show();
                    edit_nome.setFocusable(true);

                } else if (email.isEmpty() || email.equals("") || !isEmailValido(email)) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM EMAIL VÁLIDO",
                            Toast.LENGTH_SHORT).show();
                    edit_email.setFocusable(true);
                } else if (senha.isEmpty() || senha.equals("") || !isSenhaValida(senha)) {
                    Toast.makeText(getApplicationContext(), "INSIRA UMA SENHA",
                            Toast.LENGTH_SHORT).show();
                    edit_senha.setFocusable(true);
                } else if (telefone.isEmpty() || telefone.equals("") || !isTelefoneValido(telefone)) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM TELEFONE VÁLIDO",
                            Toast.LENGTH_SHORT).show();
                    edit_tell.setFocusable(true);
                } else {
                    Usuario user = new Usuario(
                            nome,
                            email,
                            senha,
                            "USER_APP",
                            telefone,
                            LocalDate.now(),
                            "ATIVO"

                    );

                    int res = UsuarioDao.inserirUsuario(user, getBaseContext());
                    if (res <= 0) {
                        Snackbar.make(btnInserir, "Inserção não realizada!", Snackbar.LENGTH_LONG).show();
                    } else {
                        Snackbar.make(btnInserir, "Inserção realizada com sucesso!", Snackbar.LENGTH_LONG).show();
                        Intent it = new Intent(Cadastro.this, Login2.class);
                        startActivity(it);
                    }

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

    public boolean isEmailValido(String email) {
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        }
        return false;
    }

    public boolean isSenhaValida(String senha) {
        if (senha.length() < 6) {
            Snackbar.make(btnInserir, "Senha deve conter no mínimo 6 caracteres", Snackbar.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public boolean isTelefoneValido(String telefone) {

        if (telefone.length() < 8) {
            Snackbar.make(btnInserir, "O telefone deve conter no mínimo 8 caracteres", Snackbar.LENGTH_LONG).show();
        } else {
            if (Patterns.PHONE.matcher(telefone).matches()) {
                return true;
            }
        }
        return false;
    }


    private void IniciarComponentes() {

        voltar = findViewById(R.id.voltar);
    }


}
