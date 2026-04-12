package EstruturasRepetitivas.For;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber todos os impares ate ele: ");
        int numero = sc.nextInt();
        if (1 <= numero && numero <= 1000) {
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
