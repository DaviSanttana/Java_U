package EstruturaSequencial_Section_4.Aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosComDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Utilizado para mudar a localidade do sitema , se fosse o brasil seria usado " , " e nao ponto;
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        System.out.println("You enter: " + x);

        scanner.close();
    }
}
