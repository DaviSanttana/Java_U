package EstruturaSequencial.Aulas;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();
        System.out.println("You enter: " + x);

        scanner.close();
    }
}
