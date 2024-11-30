package com.mycompany.vetores18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] VET = new int[50];
        boolean repetido = false;

        
        System.out.println("Digite 50 números para o vetor:");
        for (int i = 0; i < 50; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            VET[i] = scanner.nextInt();
        }

        
        System.out.println("\nNúmeros repetidos e suas posições:");

        for (int i = 0; i < 50; i++) {
            for (int j = i + 1; j < 50; j++) {
                if (VET[i] == VET[j]) {
                    System.out.println("Número " + VET[i] + " repetido nas posições " + (i + 1) + " e " + (j + 1));
                    repetido = true;
                    break; 
                }
            }
        }

        if (!repetido) {
            System.out.println("Não existem números repetidos no vetor.");
        }

        scanner.close();
    }
}
