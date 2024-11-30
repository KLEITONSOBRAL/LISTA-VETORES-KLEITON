package com.mycompany.vetores27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] originalArray = new int[1000];
        int[] copiedArray = new int[1000];

        
        System.out.println("Digite 1000 números inteiros:");
        for (int i = 0; i < 1000; i++) {
            originalArray[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 1000; i++) {
            copiedArray[i] = originalArray[i];
        }

  

        scanner.close();
    }
}

