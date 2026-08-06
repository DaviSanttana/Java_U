package Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex003 {
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

        double sumPares = 0;
        int pares = 0;
         double mediapares;
        for (int i = 0; i < n; i++) {
            if (vec[i] % 2 == 0) {
                sumPares += vec[i];
                pares++;
            }
        }
        if (pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            mediapares = sumPares / pares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
        }
    }

}
