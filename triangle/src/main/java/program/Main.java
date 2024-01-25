package program;

import entidades.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.getArea();
        double areaY = y.getArea();

        showArea('X', areaX);
        showArea('Y', areaY);

        System.out.println(largerArea(areaX, areaY));

    }

    public static void showArea(char a, double n) {
        System.out.printf("Triangle %c area: %.4f\n", a, n);
    }

    public static String largerArea(double x, double y) {
        return (x > y) ? "Larger area: X" : "Larger area: Y";
    }
}
