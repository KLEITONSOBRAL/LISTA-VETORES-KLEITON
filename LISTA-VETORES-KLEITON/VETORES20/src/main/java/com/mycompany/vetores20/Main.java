package com.mycompany.vetores20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[1000];

        System.out.println("Digite 1000 números:");

        for (int i = 0; i < 1000; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");

        for (int i = 999; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");

        for (int i = 0; i < 1000; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + " ");
            }
        }

        System.out.println("\n\nNúmeros entre 10 e 50:");

        for (int i = 0; i < 1000; i++) {
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                System.out.print(numeros[i] + " ");
            }
        }

        scanner.close();
    }
}
