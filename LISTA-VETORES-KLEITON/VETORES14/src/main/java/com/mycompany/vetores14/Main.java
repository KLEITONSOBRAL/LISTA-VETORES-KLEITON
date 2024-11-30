package com.mycompany.vetores14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] temperaturas = new int[365];
        double somaTemperaturas = 0;
        int menorTemperatura = Integer.MAX_VALUE;
        int maiorTemperatura = Integer.MIN_VALUE;

        System.out.println("Digite as temperaturas médias de todos os dias do ano (365 dias):");
        for (int i = 0; i < 365; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextInt();
            somaTemperaturas += temperaturas[i];

            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }

            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        double mediaAnual = somaTemperaturas / 365;

        int diasAbaixoMedia = 0;
        for (int i = 0; i < 365; i++) {
            if (temperaturas[i] < mediaAnual) {
                diasAbaixoMedia++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + mediaAnual);
        System.out.println("Número de dias com temperatura inferior à média anual: " + diasAbaixoMedia);

        scanner.close();
    }
}
