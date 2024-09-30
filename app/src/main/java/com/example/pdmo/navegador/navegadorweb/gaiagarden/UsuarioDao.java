package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDao {

    public static int inserirUsuario(Usuario usuario, Context ctx) {

        int resposta = 0;


        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement(
                    "Insert Into Usuario values(?,?,?,?,?,?,?)"
            );

            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getSenha());
            pst.setString(5, usuario.getTelefone());
            pst.setString(4, usuario.getNivelAcesso());
            pst.setLocalDate


            resposta = pst.executeUpdate();


        } catch (Exception e) {
            e.getMessage();
        }

        return resposta;
    }
}
