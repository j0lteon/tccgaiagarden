package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditarPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        EditText email, nome;
        Button btnSalvar;

        email = findViewById(R.id.edit_email);
        nome = findViewById(R.id.edit_nome);

        btnSalvar = findViewById(R.id.salvar);

        try{
            Usuario usuario = Conexao.obterLogado(getBaseContext());


            email.setText(usuario.getEmail());
            nome.setText(usuario.getNome());

            btnSalvar.setOnClickListener((v ->{
                usuario.setEmail(email.getText().toString());
                usuario.setNome(nome.getText().toString());

                Conexao.atualizarUsuario(getBaseContext(), usuario);
                SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("email", email.getText().toString());
                editor.apply();

                Intent it = new Intent(this, Perfil.class);
                startActivity(it);
            }));
        }catch (Exception e){

        }
    }
}