package com.mycompany.vetores22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> descricoes = new ArrayList<>();
        List<Double> valores = new ArrayList<>();
        double somaValores = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite a descrição do produto: ");
            String descricao = scanner.nextLine();
            System.out.print("Digite o valor do produto: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();  // Limpa o buffer

            descricoes.add(descricao);
            valores.add(valor);
            somaValores += valor;

            System.out.print("Deseja continuar? (s/n): ");
            char resposta = scanner.nextLine().charAt(0);
            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
            }
        }

        double mediaValores = somaValores / valores.size();

        System.out.println("\nProdutos abaixo da média de preço:");
        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) < mediaValores) {
                System.out.println("Descrição: " + descricoes.get(i) + ", Valor: " + valores.get(i));
            }
        }

        System.out.print("\nDigite um caractere para filtrar produtos: ");
        char filtro = scanner.nextLine().charAt(0);

        System.out.println("\nProdutos cujas descrições começam com o caractere '" + filtro + "':");
        for (int i = 0; i < descricoes.size(); i++) {
            if (descricoes.get(i).toUpperCase().charAt(0) == Character.toUpperCase(filtro)) {
                System.out.println("Descrição: " + descricoes.get(i));
            }
        }

        scanner.close();
    }
}
