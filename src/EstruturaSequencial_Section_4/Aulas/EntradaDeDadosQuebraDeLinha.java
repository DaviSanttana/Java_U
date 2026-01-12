package EstruturaSequencial_Section_4.Aulas;

import java.util.Scanner;

public class EntradaDeDadosQuebraDeLinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s1, s2 ,s3;

        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println("You enter: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scanner.close();
    }
}
