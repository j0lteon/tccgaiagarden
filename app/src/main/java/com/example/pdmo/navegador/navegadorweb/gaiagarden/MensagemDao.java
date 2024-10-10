package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.content.Context;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MensagemDao {

    public static int inserirMensagem(Mensagem mensagem, Context ctx){

        int answer = 0;

        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement(
                    "Insert Into Mensagem(dataMensagem, emissor, email, telefone, texto, statusMensagem)"
                    + "values(?,?,?,?,?,?)"
            );

            pst.setDate(1, Date.valueOf(mensagem.getDataMensagem().toString()));
            pst.setString(2, mensagem.getEmissor());
            pst.setString(3, mensagem.getEmail());
            pst.setString(4, mensagem.getTelefone());
            pst.setString(5, mensagem.getTexto());
            pst.setString(6, mensagem.getStatusMensagem());

            answer = pst.executeUpdate();

        } catch (Exception e) {
            e.getMessage();
        }
        return answer;

    }

}
