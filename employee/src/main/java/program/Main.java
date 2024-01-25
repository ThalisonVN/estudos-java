package program;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Funcionario funcionario = new Funcionario();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s, $ %.2f\n\n", funcionario.name, funcionario.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double n = sc.nextDouble();
        funcionario.increaseSalary(n);

        System.out.printf("\nUpdate data: %s, $ %.2f\n", funcionario.name, funcionario.netSalary());

        sc.close();
    }
}
