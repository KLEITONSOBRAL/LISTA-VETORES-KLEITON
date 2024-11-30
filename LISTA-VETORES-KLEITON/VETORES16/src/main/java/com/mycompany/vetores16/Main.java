package com.mycompany.vetores16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] V1 = new int[15];
        int[] V2 = new int[15];
        int contador = 0;

        System.out.println("Digite os 15 números para o vetor V1:");
        for (int i = 0; i < 15; i++) {
            System.out.print("V1[" + (i + 1) + "]: ");
            V1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 15 números para o vetor V2:");
        for (int i = 0; i < 15; i++) {
            System.out.print("V2[" + (i + 1) + "]: ");
            V2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            if (V1[i] == V2[i]) {
                contador++;
            }
        }

        System.out.println("\nQuantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: " + contador);

        scanner.close();
    }
}
