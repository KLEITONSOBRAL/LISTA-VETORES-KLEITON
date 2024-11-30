package com.mycompany.vetores13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + (i + 1) + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + (i + 1) + "]: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        System.out.println("\nVetor Soma (A + B):");
        for (int i = 0; i < N; i++) {
            System.out.println("Soma[" + (i + 1) + "]: " + Soma[i]);
        }

        scanner.close();
    }
}
