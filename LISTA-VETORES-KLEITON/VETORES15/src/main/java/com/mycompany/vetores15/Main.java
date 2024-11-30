package com.mycompany.vetores15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];
        int[] novoVetor;
        boolean numeroEncontrado = false;
        int numeroBuscado;

        System.out.println("Digite 20 números para o vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite um número para buscar no vetor: ");
        numeroBuscado = scanner.nextInt();

        for (int i = 0; i < 20; i++) {
            if (vetor[i] == numeroBuscado) {
                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado) {
            novoVetor = new int[19]; 
            int indexNovoVetor = 0;
            for (int i = 0; i < 20; i++) {
                if (vetor[i] != numeroBuscado) {
                    novoVetor[indexNovoVetor++] = vetor[i];
                }
            }

            System.out.println("\nNovo vetor (sem o número " + numeroBuscado + "):");
            for (int i = 0; i < 19; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("\nO número " + numeroBuscado + " não existe no vetor.");
        }

        scanner.close();
    }
}
