package EstruturaSequencial_Section_4.Aulas;

import java.util.Scanner;

public class EntradaDeDadosComChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char x = scanner.next().charAt(0);// Ira ler apenas o primeiro caractere digitado
        System.out.println("You enter: " + x);

        scanner.close();
    }
}
