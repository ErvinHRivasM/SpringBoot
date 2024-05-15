package com.variasavanzadoSpringboot.Avanzado_.models;
import javax.persistence.*;

@Entity
@Table(name="PrimerTabla")
public class ObjetosPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPrimerTabla;
    private String name;
    private int valor;

    public ObjetosPost(){

    }

    public ObjetosPost(Integer idPrimerTabla, String name, int valor) {
        this.idPrimerTabla = idPrimerTabla;
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

    public Integer getIdPrimerTabla() {
        return idPrimerTabla;
    }

    public void setIdPrimerTabla(Integer idPrimerTabla) {
        this.idPrimerTabla = idPrimerTabla;
    }
}
