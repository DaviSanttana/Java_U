package ProgramacaoOrientadaObjetos.Aula2.ExFixacao.application;

import ProgramacaoOrientadaObjetos.Aula2.ExFixacao.entities.Converter;
import ProgramacaoOrientadaObjetos.Aula2.Exemplo01.entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverter {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.println("Current dollar exchange rate: ** 5.18 **");
        System.out.println("Standard IOF rate: ** 3.50% **");

        System.out.println("How many dollars will be bought?");
        double dollarToBuy = sc.nextDouble();

        double amount = Converter.TotalDollarBuy(dollarToBuy);
        System.out.printf("Brazilian Real converted to US Dollars %.2f%n", amount);
    }
}

