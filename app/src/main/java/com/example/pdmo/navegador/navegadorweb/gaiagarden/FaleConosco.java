package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.snackbar.Snackbar;

import java.time.LocalDate;

public class FaleConosco extends AppCompatActivity {

    ImageView seta;

    EditText edit_nome, edit_email, edit_tell, edit_mensagem;

    Button btnInserir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fale_conosco);

        edit_nome = (EditText) findViewById(R.id.edit_nome);
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_tell = (EditText) findViewById(R.id.edit_tell);
        edit_mensagem = (EditText) findViewById(R.id.edit_mensagem);
        btnInserir = (Button) findViewById(R.id.enviar);

        seta = findViewById(R.id.seta);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(FaleConosco.this, Home.class);
                startActivity(it);
            }
        });


        btnInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Mensagem men = new Mensagem(

                        LocalDate.now(),
                        edit_nome.getText().toString(),
                        edit_email.getText().toString(),
                        edit_tell.getText().toString(),
                        edit_mensagem.getText().toString(),
                        "NÃO LIDA"
                );

                int res = MensagemDao.inserirMensagem(men, getBaseContext());
                if(res <= 0){
                    Snackbar.make(btnInserir, "Inserção não realizada!", Snackbar.LENGTH_LONG).show();

                }
                else {
                    Intent it = new Intent(FaleConosco.this, Home.class);
                    startActivity(it);
                }

            }
        });

    }
}