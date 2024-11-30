package com.mycompany.vetores25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] meses = {
            "", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("O mês é: " + meses[mes]);
        } else {
            System.out.println("Número de mês inválido.");
        }

        scanner.close();
    }
}
