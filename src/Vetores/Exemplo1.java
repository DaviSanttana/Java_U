package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas alturas quer inserir: ");
        int n = scanner.nextInt();
        double[] vec = new double[n];

        for (int i = 0; i < n; i++) {
            vec[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n ; i++) {
            sum += vec[i];
        }
        double avg = sum/n;
        System.out.println("A media é: "+ avg);
        scanner.close();
    }
}

