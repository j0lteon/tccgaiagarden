package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mudas extends AppCompatActivity {

    ImageView muda;

    ImageView seta;

    ImageView gaiagardenlogo;

    ImageView estrela;

    ImageView faleconosco;

    private TextView textomuda;

    private TextView voltartexto;

    private TextView meusfavoritos;

    private TextView textofaleconosco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudas);

        muda = findViewById(R.id.muda);

        muda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

        textomuda = findViewById(R.id.textomuda);
        IniciarComponentes2();
        textomuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mudas.this, DescricaoMudas.class);
                startActivity(it);
            }
        });

        seta = findViewById(R.id.voltar);

        seta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Categorias.class);
                startActivity(it);
            }
        });

        voltartexto = findViewById(R.id.voltartexto);
        IniciarComponentes3();

        voltartexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mudas.this, Categorias.class);
                startActivity(it);
            }
        });


        gaiagardenlogo = findViewById(R.id.logo1);

        gaiagardenlogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Home.class);
                startActivity(it);
            }
        });

        estrela = findViewById(R.id.estrela);

        estrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        meusfavoritos = findViewById(R.id.meusfavoritos);
        IniciarComponentes4();

        meusfavoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mudas.this, Meus_Favoritos.class);
                startActivity(it);
            }
        });

        faleconosco = findViewById(R.id.imgfalecnsc);

        faleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(Mudas.this, FaleConosco.class);
                startActivity(it);
            }
        });

        textofaleconosco = findViewById(R.id.faleconosco);
        IniciarComponentes();

        textofaleconosco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Mudas.this, FaleConosco.class);
                startActivity(it);
            }
        });

    }
    private void IniciarComponentes(){

        textofaleconosco = findViewById(R.id.faleconosco);
    }

    private void IniciarComponentes2(){

        textomuda = findViewById(R.id.textomuda);
    }

    private void IniciarComponentes3(){

        voltartexto = findViewById(R.id.voltartexto);
    }

    private void IniciarComponentes4(){

        meusfavoritos = findViewById(R.id.meusfavoritos);
    }
}