package DesafiosDeCodigo;

import java.util.Scanner;

public class Desafio3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        if (tipoConta.equals("corrente") || tipoConta.equals("poupanca") || tipoConta.equals("investimento")) {
            System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipoConta + " está pronta para uso.");
        } else {
            System.out.println("Tipo de conta invalido.");
        }

        scanner.close();
    }
}
