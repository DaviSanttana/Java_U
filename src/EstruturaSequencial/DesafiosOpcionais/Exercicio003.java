package EstruturaSequencial.DesafiosOpcionais;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C , D;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int dif = (A * B - C * D );

        System.out.printf("the difference between the products is "+dif);

        sc.close();
    }
}
