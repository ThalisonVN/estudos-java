package program;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");

        int n = sc.nextInt();

        Pessoa[] vect = new Pessoa[n];

        double mediaAltura = 0.0;
        int menor16 = 0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da pessoa " + (i+1));

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoa(nome, idade, altura);

            mediaAltura += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                menor16++;
            }
        }
        mediaAltura /= vect.length;

        System.out.printf("Altura média das pessoas: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %d%%\n", (menor16 * 100 / vect.length));

        for (Pessoa pessoa : vect) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }

        sc.close();
    }
}
