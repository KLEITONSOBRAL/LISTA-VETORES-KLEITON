package com.mycompany.vetores2;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[100];
        

        for (int i = 0; i < 100; i++) {
            numeros[i] = 100 - i; 
        }
        
        
        System.out.println("Números armazenados no vetor (de 100 a 1):");
        for (int i = 0; i < 100; i++) {
            System.out.println(numeros[i]);
        }
    }
}

