package javaUdemy;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;
        for(int i = 0; i < n; i++) {
            soma += sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
