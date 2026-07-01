package DesafiosDeCodigo;

import java.util.Scanner;

public class Desafio1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        double valorSalario = scanner.nextDouble();
        double valorBeneficios = scanner.nextDouble();

        double valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.5 * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10 * valorSalario;
        }else {
            valorImposto = 0.15 * valorSalario;
        }

        double valorReceber = valorSalario - valorImposto + valorBeneficios;
        System.out.println("O empregado vai receber o total de "+ valorReceber);
    }
}
