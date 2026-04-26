package IntroducaoJava.EstruturasRepetitivas.For;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fatorial não existe para números negativos.");
            return;
        }
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
        sc.close();
    }
}
