package com.example.pdmo.navegador.navegadorweb.gaiagarden;

import java.time.LocalDate;

public class Mensagem {

    private int id;
    private LocalDate dataMensagem;
    private String emissor;
    private String email;
    private String telefone;
    private String texto;
    private String statusMensagem;

    public Mensagem(LocalDate dataMensagem, String emissor, String email, String telefone, String texto, String statusMensagem) {
        this.dataMensagem = dataMensagem;
        this.emissor = emissor;
        this.email = email;
        this.telefone = telefone;
        this.texto = texto;
        this.statusMensagem = statusMensagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataMensagem() {
        return dataMensagem;
    }

    public void setDataMensagem(LocalDate dataMensagem) {
        this.dataMensagem = dataMensagem;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getStatusMensagem() {
        return statusMensagem;
    }

    public void setStatusMensagem(String statusMensagem) {
        this.statusMensagem = statusMensagem;
    }
}

