package EstruturaSequencial_Section_4.Aulas;

import java.util.Scanner;

public class EntradaDeDadosComInteiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println("You enter: " + x);

        scanner.close();
    }
}
