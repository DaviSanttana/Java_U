package EstruturaCondicional.DesafiosOpcionais;

import java.util.Scanner;
public class Exercicios002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("O numero: " + number + " é par");
        } else {
            System.out.println("O numero: " + number + " é impar");
        }
    }
}
