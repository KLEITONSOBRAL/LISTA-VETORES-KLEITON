package com.mycompany.vetores21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> nomes = new ArrayList<>();
        List<Double> salarios = new ArrayList<>();
        double somaSalarios = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();  // Limpa o buffer

            nomes.add(nome);
            salarios.add(salario);
            somaSalarios += salario;

            System.out.print("Deseja continuar? (s/n): ");
            char resposta = scanner.nextLine().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }

        double mediaSalarial = somaSalarios / salarios.size();

        System.out.println("\nFuncionários com salário acima da média:");
        for (int i = 0; i < salarios.size(); i++) {
            if (salarios.get(i) > mediaSalarial) {
                System.out.println("Nome: " + nomes.get(i) + ", Salário: " + salarios.get(i));
            }
        }

        System.out.println("\nFuncionários cujo nome começa com a letra A:");
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).toUpperCase().charAt(0) == 'A') {
                System.out.println("Nome: " + nomes.get(i));
            }
        }

        scanner.close();
    }
}

