package org.example;

public class Cantante {
    private String nome;
    private String nazionalità;
    private String nota_caratteristica;

    public Cantante(String nome, String nota_caratteristica, String nazionalità) {
        this.nome = nome;
        this.nota_caratteristica = nota_caratteristica;
        this.nazionalità = nazionalità;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalità() {
        return nazionalità;
    }

    public void setNazionalità(String nazionalità) {
        this.nazionalità = nazionalità;
    }

    public String getNota_caratteristica() {
        return nota_caratteristica;
    }

    public void setNota_caratteristica(String nota_caratteristica) {
        this.nota_caratteristica = nota_caratteristica;
    }
}