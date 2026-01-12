package EstruturaSequencial.Aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosNaMesmaLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();

        System.out.println("You enter: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        scanner.close();
    }
}
