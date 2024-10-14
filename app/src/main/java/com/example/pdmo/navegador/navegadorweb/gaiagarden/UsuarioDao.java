package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;


public class UsuarioDao {

    public static int inserirUsuario(Usuario usuario, Context ctx) {

        int resposta = 0;


        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement(
                    "Insert Into Usuario (nome, email, senha, nivelAcesso, telefone, dataCadastro, statusUsuario) " + "values(?,?,?,?,?,?,?)"
            );

            String senha = Base64.getEncoder().encodeToString(usuario.getSenha().getBytes());

            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, senha);
            pst.setString(5, usuario.getTelefone());
            pst.setString(4, usuario.getNivelAcesso());
            pst.setDate(6, Date.valueOf(usuario.getDataCadastro().toString()));
            pst.setString(7, usuario.getStatusUsuario());


            resposta = pst.executeUpdate();


        } catch (Exception e) {
            e.getMessage();
        }

        return resposta;
    }
}
