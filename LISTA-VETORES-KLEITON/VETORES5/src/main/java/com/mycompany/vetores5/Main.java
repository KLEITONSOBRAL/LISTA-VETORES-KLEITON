package com.mycompany.vetores5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        double[] numeros = new double[10];
        double[] metades = new double[10];
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextDouble();
            metades[i] = numeros[i] / 2;
        }
        
        
        System.out.println("Metade dos números digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.println(metades[i]);
        }

        
        scanner.close();
    }
}
