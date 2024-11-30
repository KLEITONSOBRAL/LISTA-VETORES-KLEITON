package com.mycompany.vetores17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[30];
        int numeroBuscado;
        int contador = 0;

        System.out.println("Digite 30 números para o vetor:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para buscar no vetor: ");
        numeroBuscado = scanner.nextInt();

        for (int i = 0; i < 30; i++) {
            if (vetor[i] == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("\nO número " + numeroBuscado + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
}
