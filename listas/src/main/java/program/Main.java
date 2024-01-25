package program;

import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Locale.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("How many employees will be registered?: ");
        int n = sc.nextInt();

        List<Empregado> vect = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            System.out.println();

            System.out.println("Employee #" + i + ":");
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Empregado e = new Empregado(name, id, salary);
            vect.add(e);
        }

        System.out.print("Enter the employee ID that will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double x = sc.nextDouble();

        for (Empregado empregado : vect) {
            if (empregado.getId() == id) {
                empregado.increaseSalary(x);
            }
        }

        System.out.println("List of employees: ");

        for (Empregado empregado : vect) {
            empregado.showEmpregado();
        }

    }
}
