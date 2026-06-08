package ProgramacaoOrientadaObjetos.Aula2.Exemplo01.application;

import ProgramacaoOrientadaObjetos.Aula2.Exemplo01.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Checklist {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference : %.2f%n", c);
        System.out.printf("Volume : %.2f%n", v);
        System.out.printf("Pi value: %.2f%n", Calculator.PI);


        sc.close();
    }
}
