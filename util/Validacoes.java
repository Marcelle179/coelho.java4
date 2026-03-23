package com.sgp.modelos;

import com.sgp.util.Validacoes;

public class Coelho {

    private String nome;
    private String cor;
    private int idade;
    private double altura;

    public Coelho(String nome, String cor, int idade, double altura) {
        if (!Validacoes.nomeValido(nome)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroNome(nome));
        }
        if (!Validacoes.idadeValida(idade)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroIdade(idade));
        }
        if (!Validacoes.alturaValida(altura)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroAltura(altura));
        }

        this.nome = nome;
        this.cor = cor != null && !cor.trim().isEmpty() ? cor : "Branco";
        this.idade = idade;
        this.altura = altura;
    }

    public Coelho() {
        this.nome = "Chico";
        this.cor = "Branco";
        this.idade = 1;
        this.altura = 0.5;
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

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        if (!Validacoes.nomeValido(nome)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroNome(nome));
        }
        this.nome = nome;
    }

    public void setCor(String cor) {
        if (cor != null && !cor.trim().isEmpty()) {
            this.cor = cor;
        }
    }

    public void setIdade(int idade) {
        if (!Validacoes.idadeValida(idade)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroIdade(idade));
        }
        this.idade = idade;
    }

    public void setAltura(double altura) {
        if (!Validacoes.alturaValida(altura)) {
            throw new IllegalArgumentException(Validacoes.mensagemErroAltura(altura));
        }
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Coelho [nome=" + nome + ", cor=" + cor + ", idade=" + idade + ", altura=" + altura + "m]";
    }
}