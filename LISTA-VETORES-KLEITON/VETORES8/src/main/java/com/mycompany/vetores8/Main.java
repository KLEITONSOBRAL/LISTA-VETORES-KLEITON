package com.mycompany.vetores8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double[] notas = new double[20];

        
        System.out.println("Digite as notas dos 20 alunos:");
        double soma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; 
        }

        
        double media = soma / 20;
        System.out.println("\nMédia da turma: " + media);

        
        int contagemAcimaMedia = 0;
        for (int i = 0; i < 20; i++) {
            if (notas[i] > media) {
                contagemAcimaMedia++;
            }
        }

        
        System.out.println("Número de alunos com nota acima da média: " + contagemAcimaMedia);

        
        scanner.close();
    }
}
