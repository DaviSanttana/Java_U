package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo2 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos produtos quer inserir: ");
        int n = scanner.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum/n;
        System.out.println("A media é: "+ avg);
        scanner.close();

    }
}
