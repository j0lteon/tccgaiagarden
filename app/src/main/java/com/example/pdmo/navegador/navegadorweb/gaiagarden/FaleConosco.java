package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

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

        edit_nome = findViewById(R.id.edit_nome);
        edit_email = findViewById(R.id.edit_email);
        edit_tell = findViewById(R.id.edit_tell);
        edit_mensagem = findViewById(R.id.edit_mensagem);
        btnInserir = findViewById(R.id.enviar);

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
            public void onClick(View v) {

                String emissor = edit_nome.getText().toString();
                String email = edit_email.getText().toString();
                String telefone = edit_tell.getText().toString();
                String texto = edit_mensagem.getText().toString();


                if (emissor.isEmpty() || emissor.equals("")) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM NOME",
                            Toast.LENGTH_SHORT).show();
                    edit_nome.setFocusable(true);

                }

                else if (email.isEmpty() || email.equals("") || !isEmailValido(email)) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM EMAIL VÁLIDO",
                            Toast.LENGTH_SHORT).show();
                    edit_email.setFocusable(true);
                }
                else if (telefone.isEmpty() || telefone.equals("") || !isTelefoneValido(telefone)) {
                    Toast.makeText(getApplicationContext(), "INSIRA UM TELEFONE VÁLIDO",
                            Toast.LENGTH_SHORT).show();
                    edit_tell.setFocusable(true);
                }else if (texto.isEmpty() || texto.equals("")) {
                    Toast.makeText(getApplicationContext(), "INSIRA UMA MENSAGEM",
                            Toast.LENGTH_SHORT).show();
                    edit_mensagem.setFocusable(true);

                }

                else {
                    Mensagem men = new Mensagem(
                            LocalDate.now(),
                            emissor,
                            email,
                            telefone,
                            texto,
                            "NÃO LIDA"
                    );

                    int res = MensagemDao.inserirMensagem(men, getBaseContext());
                    if (res <= 0) {
                        Snackbar.make(btnInserir, "Inserção não realizada!", Snackbar.LENGTH_LONG).show();
                    } else {
                        Snackbar.make(btnInserir, "Inserção realizada com sucesso!", Snackbar.LENGTH_LONG).show();
                        Intent it = new Intent(FaleConosco.this, Home.class);
                        startActivity(it);
                    }

                }

            }
        });

    }
    public boolean isEmailValido(String email){
        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return true;
        }
        return false;
    }
    public boolean isTelefoneValido(String telefone){

        if (telefone.length()<8){
            Snackbar.make(btnInserir, "O telefone deve conter no mínimo 8 caracteres", Snackbar.LENGTH_LONG).show();
        } else {
            if (Patterns.PHONE.matcher(telefone).matches()){
                return true;
            }
        }
        return false;
    }
}