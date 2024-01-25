package javaUdemy;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.printf("Dia da semana: %s\n", semana(x-1));

        sc.close();

    }

    public static String semana(int x) {
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
                         "Quinta-feira", "Sexta-feira", "Sábado"};

        try {
            return dias[x];
        } catch (Exception e) {
            return "Valor inválido";
        }
    }
}
