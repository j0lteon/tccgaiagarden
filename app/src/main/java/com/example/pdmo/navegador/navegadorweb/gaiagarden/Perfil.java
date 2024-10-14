package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        TextView nome = findViewById(R.id.user);
        TextView email = findViewById(R.id.email);

        try{
            Usuario usuario = Conexao.obterLogado(getBaseContext());

            nome.setText(usuario.getNome());
            email.setText(usuario.getEmail());
        }catch (Exception e){

        }

        Button btnEditar = findViewById(R.id.editar);

        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Perfil.this, EditarPerfil.class);
                startActivity(it);
            }
        });

        Button btnLogout = findViewById(R.id.logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.remove("email");
                editor.apply();
                Intent it = new Intent(Perfil.this, Login2.class);
                startActivity(it);
            }
        });

    }
}