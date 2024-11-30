package com.mycompany.vetores12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Digite 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = 19; i >= 0; i--) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        scanner.close();
    }
}
