package com.mycompany.vetores1;

public class Main {
    public static void main(String[] args) {
        
        int[] numeros = new int[51];
        
        
        for (int i = 0; i <= 50; i++) {
            numeros[i] = i;
        }
        
        
        System.out.println("Números armazenados no vetor:");
        for (int i = 0; i <= 50; i++) {
            System.out.println(numeros[i]);
        }
    }
}

