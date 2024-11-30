package com.mycompany.vetores11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10];
        int[] M = new int[10];

        System.out.println("Digite 10 números para o vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + (i + 1) + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor de X: ");
        int X = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("\nVetor M (resultado da multiplicação):");
        for (int i = 0; i < 10; i++) {
            System.out.println("M[" + (i + 1) + "]: " + M[i]);
        }

        scanner.close();
    }
}
