package com.mycompany.vetores19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[250];
        double[] alturas = new double[250];
        double[] pesos = new double[250];
        char[] sexos = new char[250];
        int totalHomens = 0, totalMulheres = 0;
        double somaPesos = 0;
        double maiorAltura = 0;
        String pessoaMaisAlta = "";

        for (int i = 0; i < 250; i++) {
            System.out.println("Digite as informações da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
            System.out.print("Peso: ");
            pesos[i] = scanner.nextDouble();
            System.out.print("Sexo (F/M): ");
            sexos[i] = scanner.next().charAt(0);
            scanner.nextLine(); // Limpa o buffer do scanner

            if (sexos[i] == 'M' || sexos[i] == 'm') {
                totalHomens++;
            } else if (sexos[i] == 'F' || sexos[i] == 'f') {
                totalMulheres++;
            }

            somaPesos += pesos[i];

            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
                pessoaMaisAlta = nomes[i];
            }
        }

        System.out.println("\nListagem de todas as pessoas:");
        for (int i = 0; i < 250; i++) {
            System.out.println(nomes[i] + " " + alturas[i] + " " + pesos[i] + " " + sexos[i]);
        }

        double percentualHomens = (totalHomens / 250.0) * 100;
        double percentualMulheres = (totalMulheres / 250.0) * 100;

        System.out.println("\nQuantidade de Homens: " + totalHomens);
        System.out.println("Quantidade de Mulheres: " + totalMulheres);
        System.out.println("Percentual de Homens: " + percentualHomens + "%");
        System.out.println("Percentual de Mulheres: " + percentualMulheres + "%");

        double mediaPeso = somaPesos / 250;
        System.out.println("\nMédia de peso: " + mediaPeso);

        System.out.println("\nA pessoa mais alta é: " + pessoaMaisAlta);

        scanner.close();
    }
}

