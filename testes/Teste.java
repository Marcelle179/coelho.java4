package com.sgp.testes;

import com.sgp.modelos.Coelho;

public class Teste {

    public static void main(String[] args) {
        Coelho coelhoNulo = null;
        imprimirCoelho(coelhoNulo);

        Coelho coelho = new Coelho();
        imprimirCoelho(coelho);

        Coelho coelhoPadrao = new Coelho();
        System.out.println("\nTestando construtor com valores padrão:");
        imprimirCoelho(coelhoPadrao);

        coelho.pular();

        System.out.println("Nome: " + coelho.getNome());
        System.out.println("Cor: " + coelho.getCor());

        coelho.setNome("Chico");
        System.out.println("Nome modificado (setter): " + coelho.getNome());

        coelho.setIdade(2);
        System.out.println("Coelho após modificações: " + coelho.toString());
    }

    public static void imprimirCoelho(Coelho coelho) {
        if (coelho == null) {
            System.out.println("Coelho não inicializado!");
            return;
        }
        System.out.println(coelho);
        coelho.pular();
    }
}