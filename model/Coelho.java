package com.sgp.modelos;

public class Coelho {

    private String nome;
    private String cor;
    private int idade;

    public Coelho(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Coelho() {
        this.nome = "Chico";
        this.cor = "Branco";
        this.idade = 1;
    }

    public void pular() {
        System.out.println(nome + " está pulando!");
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Coelho [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
    }
}