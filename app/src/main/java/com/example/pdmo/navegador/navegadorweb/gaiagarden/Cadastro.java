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

import com.google.android.material.textfield.TextInputLayout;

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
                inserirUsuario();
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

    private void inserirUsuario(){
        try {
            PreparedStatement pst =
                    Conexao.conectar(getBaseContext()).prepareStatement("Inserir INTO Usuario (nome, email, senha, nivelAcesso, telefone, dataCadastro, statusUsuario) values (?,?,?,?,?,?,?)");
            String nome = edit_nome.getText().toString();
            String email = edit_email.getText().toString();
            String senha = edit_senha.getText().toString();
            String nivelAcesso = "USER_APP";
            String telefone = edit_tell.getText().toString();
            String dataCadastro = LocalDate.now().toString();
            String statusUsuario = "ATIVO";

            if(nome.isEmpty() || nome.equals("")){
                Toast.makeText(getApplicationContext(), "Insira um nome",
                        Toast.LENGTH_SHORT).show();
                edit_nome.setFocusable(true);
            }else{
                pst.setString(1,nome);
            }

            if (email.isEmpty() || email.equals("")){
                Toast.makeText(getApplicationContext(), "insira um email",
                Toast.LENGTH_SHORT).show();
                edit_email.setFocusable(true);
            }else{
                pst.setString(2,email);
            }

            if (senha.isEmpty() || senha.equals("")){
                Toast.makeText(getApplicationContext(), "insira uma senha",
                        Toast.LENGTH_SHORT).show();
                edit_senha.setFocusable(true);
            }else{
                pst.setString(3,senha);
            }

            if (telefone.isEmpty() || telefone.equals("")){
                Toast.makeText(getApplicationContext(), "insira um telefone",
                        Toast.LENGTH_SHORT).show();
                edit_tell.setFocusable(true);
            }else{
                pst.setString(5,telefone);
            }

            pst.setString(4,nivelAcesso);
            pst.setString(6,dataCadastro);
            pst.setString(7,statusUsuario);

            pst.executeUpdate();
            Toast.makeText(getApplicationContext(), "USUÁRIO INSERIDO COM SUCESSO!",
                    Toast.LENGTH_SHORT).show();

        } catch (SQLException e) {
            Toast.makeText(getApplicationContext(), e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }

}
