package Vetores.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas numeros vai digitar: ");
        int n = scanner.nextInt();
        double[] vec = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digie um numero: ");
            vec[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vec[i];

        }
        double avg = sum / n;

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f  ", vec[i] );
        }

        System.out.println("\nA media é: " + avg);
        System.out.println("A soma é: " + sum);
        scanner.close();
    }
}

