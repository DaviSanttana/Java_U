package EstruturaCondicional.DesafiosOpcionais;

import java.util.Scanner;

public class Exercicios003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers from largest to smallest.");
        System.out.print("Enter a number one: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a number two: ");
        int number2 = scanner.nextInt();
        if (number1 % number2 == 0) {
            System.out.println("Os numeros: " + number1 + " e "+number2 + " são multiplos entre si");
        } else {
            System.out.println("O numeros: " + number1 + " e "+ number2 + " não são multiplos entre si");
        }
    }
}
