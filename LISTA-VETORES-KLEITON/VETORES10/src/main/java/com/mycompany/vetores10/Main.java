package com.mycompany.vetores10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Q = new int[20];

        System.out.println("Digite os 20 números positivos:");
        for (int i = 0; i < 20; i++) {
            while (true) {
                System.out.print("Elemento Q[" + (i + 1) + "]: ");
                int valor = scanner.nextInt();
                if (valor > 0) {
                    Q[i] = valor;
                    break;
                } else {
                    System.out.println("Por favor, digite um número positivo.");
                }
            }
        }

        int maiorValor = Q[0];
        int posicaoMaior = 0;
        int menorValor = Q[0];
        int posicaoMenor = 0;

        for (int i = 1; i < 20; i++) {
            if (Q[i] > maiorValor) {
                maiorValor = Q[i];
                posicaoMaior = i;
            }
            if (Q[i] < menorValor) {
                menorValor = Q[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Posição do maior valor: Q[" + (posicaoMaior + 1) + "]");
        System.out.println("\nMenor valor: " + menorValor);
        System.out.println("Posição do menor valor: Q[" + (posicaoMenor + 1) + "]");

        scanner.close();
    }
}
