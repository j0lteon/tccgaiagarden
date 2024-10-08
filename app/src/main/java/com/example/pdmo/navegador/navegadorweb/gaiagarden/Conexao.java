package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar(Context ctx) {
        Connection conn = null;

        try {
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);

            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:jtds:sqlserver://172.19.1.171;" +
                    "databaseName=bd_gaiagarden;user=sa;password=@ITB123456;");

        } catch (SQLException e){
            Toast.makeText(ctx, "SERVIDOR" + "INDISPONÍVEL", Toast.LENGTH_SHORT).show();
        }   catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }

    public static Login pesquisarLogin(String email, String senha, Context ctx){

        try {
            PreparedStatement pst = conectar(ctx).prepareStatement(
                    "Select * from Usuario WHERE email = ? and senha = ?");
            pst.setString(1, email);
            pst.setString(2, senha);
            ResultSet res = pst.executeQuery();

            while (res.next()){
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
