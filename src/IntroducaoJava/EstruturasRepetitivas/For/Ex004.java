package IntroducaoJava.EstruturasRepetitivas.For;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores quer digitar: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (b == 0) {
                System.out.println("Divisão impossivel");
            } else {
                double divisao = (double) a / b;
                System.out.printf("%.1f%n",divisao);
            }
        }
        sc.close();
    }
}
