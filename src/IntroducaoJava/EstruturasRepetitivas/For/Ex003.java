package IntroducaoJava.EstruturasRepetitivas.For;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores quer digitar: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            double a = sc.nextDouble();
            double b =  sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2+ b *3 + c*5)/10;

            System.out.println(media);
        }
        sc.close();
    }
}
