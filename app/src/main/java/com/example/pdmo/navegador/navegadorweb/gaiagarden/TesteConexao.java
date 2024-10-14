package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao extends AppCompatActivity {


    TextView BancoTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste_conexao);

        Connection conn = Conexao.conectar(TesteConexao.this);
        BancoTeste = findViewById(R.id.BancoTeste);

        try {
            if (conn != null){
                if (!conn.isClosed())
                    BancoTeste.setText("Conexão realizada com sucesso");
                else
                    BancoTeste.setText("A conexão está fechada");
            }else{
                BancoTeste.setText("Conexão nula, não realizada");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            BancoTeste.setText("Conexão falhou!!!\n" + e.getMessage());
        }

        Button button = findViewById(R.id.entrar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(TesteConexao.this, Login2.class);
                startActivity(it);
            }
        });



    }
}