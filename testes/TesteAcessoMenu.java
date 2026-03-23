package com.sgp.testes;

import java.util.Scanner;

import com.sgp.modelos.Coelho;

public class TesteAcessoMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coelho coelho = new Coelho("Teste", "Branco", 1);
        int opcao;

        do {

            imprimirMenu();
            
            opcao = recebeOp(scanner);

            switch (opcao) {
                case 1:
                    System.out.println(coelho.toString());
                    break;
                case 2:
                    alterarNome(coelho, scanner);
                    break;
                case 3:
                    alterarIdade(coelho, scanner);
                    break;
                case 4:
                    coelho.pular();
                    break;
                case 5:
                    alterarCor(coelho, scanner);
                    break;
                case 0:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void imprimirMenu() {
        System.out.println("\n=== Menu de Acesso ===");
        System.out.println("1. Mostrar dados do coelho");
        System.out.println("2. Alterar nome");
        System.out.println("3. Alterar idade");
        System.out.println("4. Fazer o coelho pular");
        System.out.println("5. Alterar cor");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int recebeOp(Scanner scanner){
        int opcao;
        try {
            opcao = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido!");
            opcao = -1;
        }
        return opcao;
    }

    public static void alterarNome(Coelho coelho, Scanner scanner) {
        System.out.print("Digite o novo nome: ");
        String novoNome = scanner.nextLine();
        coelho.setNome(novoNome);
        System.out.println("Nome alterado com sucesso!");
    }

    public static void alterarIdade(Coelho coelho, Scanner scanner) {
        System.out.print("Digite a nova idade: ");
        try {
            int novaIdade = Integer.parseInt(scanner.nextLine());
            coelho.setIdade(novaIdade);
            System.out.println("Idade alterada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Por favor, digite um número inteiro válido!");
        }
    }

    public static void alterarCor(Coelho coelho, Scanner scanner) {
        System.out.print("Digite a nova cor: ");
        String novaCor = scanner.nextLine();
        coelho.setCor(novaCor);
        System.out.println("Cor alterada com sucesso!");
    }
}