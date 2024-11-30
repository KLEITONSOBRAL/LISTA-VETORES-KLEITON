package com.mycompany.vetores3;

public class Main {
    public static void main(String[] args) {
        
        int[] pares = new int[50]; 
        
        
        int index = 0;  
        for (int i = 2; i <= 100; i += 2) {  
            pares[index] = i;
            index++;
        }
        
        
        System.out.println("Números pares no intervalo de 1 a 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}

