package com.mycompany.vetores7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String[] nomes = new String[10];
        
        
        System.out.println("Digite os nomes de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        
        System.out.print("\nDigite um nome qualquer para procurar: ");
        String nomeProcurado = scanner.nextLine();
        
        
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                encontrado = true;
                break;
            }
        }
        
        
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        
        
        scanner.close();
    }
}
