package Vetores.Vetor;


import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira quantos numeros deseja digitar (1 a 10): ");
        int n = scanner.nextInt();

        while (n < 1 || n > 10) {
            System.out.println("Digite um numero entre 1 e 10.");
            n = scanner.nextInt();
        }
        int[] numeros = new int[n];

        System.out.print("Insira os " + n + " numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Número negativo encontrado: " + numeros[i]);
            }
        }
    }
}

