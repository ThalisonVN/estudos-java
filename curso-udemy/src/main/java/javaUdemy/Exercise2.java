package javaUdemy;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextInt();

        System.out.printf("Valor a pagar: R$ %.2f", calc(x));

        sc.close();

    }

    public static double calc( double x ) {
        if(x < 100)
            return 50;
        else {
            return (x-100)*2.0 + 50;
        }
    }


}
