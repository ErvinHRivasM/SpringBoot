package com.variasavanzadoSpringboot.Avanzado_.models;

public class ObjetosPost {
    private String name;
    private int valor;

    public ObjetosPost(){

    }

    public ObjetosPost(String name, int valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
