package ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao02.application;

import ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao02.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class SalarioPorcentagem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Enter data: ");
        System.out.print("Name: ");
        funcionario.name = scanner.nextLine();
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println(funcionario);

        System.out.println("Which percentage to increase salary? ");
        double percentagem = scanner.nextDouble();
        funcionario.increaseSalary(percentagem);
        System.out.println();
        System.out.println("Update data: "+ funcionario);
    }
}
