package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Base64DataException;
import android.widget.Toast;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

public class Conexao {

    public static Connection conectar(Context ctx) {
        Connection conn = null;

        try {
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.19.1.62;" +
                    "databaseName=bd_gaiagarden;user=sa;password=@ITB123456;");

        } catch (SQLException e) {
            Toast.makeText(ctx, "SERVIDOR" + "INDISPONÍVEL", Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static String atualizarUsuario(Context ctx, Usuario usuario){
        SharedPreferences sharedPreferences = ctx.getSharedPreferences("data", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email", "");

        try{
            PreparedStatement pst = conectar(ctx).prepareStatement("update Usuario set nome = ?, email = ? where email = ?");

            pst.setString(3, email);
            System.out.println(usuario.getEmail());
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());

            ResultSet res = pst.executeQuery();
            while (res.next()){
                return "sucesso";
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    public static Usuario obterLogado(Context ctx) throws SQLException{
        SharedPreferences sharedPreferences = ctx.getSharedPreferences("data", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email", "");

        try{
            PreparedStatement pst = conectar(ctx).prepareStatement("select id, nome, email from usuario where email = ?");
            pst.setString(1, email);

            ResultSet res = pst.executeQuery();

            while(res.next()){
                Usuario usuario = new Usuario(res.getInt(1), res.getString(2), res.getString(3));

                return usuario;
            }
        }catch (Exception e){
            return null;
        }
        return null;
    }

    public static Login pesquisarLogin(String email, String senha, Context ctx) {

        try {
            senha = Base64.getEncoder().encodeToString(senha.getBytes());
            PreparedStatement pst = conectar(ctx).prepareStatement(
                    "Select * from Usuario WHERE email = ? and senha = ? and statusUsuario = 'ATIVO' ");
            pst.setString(1, email);
            pst.setString(2, senha);
            ResultSet res = pst.executeQuery();

            while (res.next()) {
                Login objLogin = new Login();
                objLogin.setEmail(res.getString(3));
                objLogin.setSenha(res.getString(4));

                return objLogin;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
