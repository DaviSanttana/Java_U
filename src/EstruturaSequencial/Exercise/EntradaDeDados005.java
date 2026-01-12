package EstruturaSequencial.Exercise;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int notes;

        System.out.print("How many notes will you type: ");
        notes = sc.nextInt();

        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < notes; i++) {
            System.out.println("Enter note: ");
            double num = sc.nextDouble();
            numbers.add(num);
        }

        double soma = 0;
        for (double num : numbers) {
            soma += num;
        }

        // Calcula a média
        double media = soma / notes;

        // Exibe a média com duas casas decimais
        System.out.printf("A média é: %.2f\n", media);

        sc.close();
    }
}
