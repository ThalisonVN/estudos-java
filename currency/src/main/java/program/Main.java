package program;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currency = new CurrencyConverter();
        System.out.print("What is the dollar price? ");
        currency.dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        currency.quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: R$ %.2f\n", currency.total());

    }
}
