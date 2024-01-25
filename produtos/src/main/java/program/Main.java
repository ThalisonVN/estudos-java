package program;

import entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        Produto produto = new Produto(name, price);

        produto.showProduct();

        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        produto.updateQuantity(quantity);

        produto.showUpdatedProduct();

        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();
        produto.removeProduct(quantity);

        produto.showUpdatedProduct();

        sc.close();

    }


}
