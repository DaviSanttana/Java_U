package IntroducaoJava.EstruturasRepetitivas.For;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dentro = 0;
        int fora = 0;
        System.out.print("Quantos valores quer digitar: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Qual o numero: ");
            int valor = sc.nextInt();
            if (10 <= valor && valor <= 20) {
                dentro += 1;
            }else {
                fora += 1;
            }
        }
        System.out.println("Numeros dentro do intervalo de 10 a 20: "+dentro);
        System.out.println("Numeros fora do intervalo de 10 a 20: "+fora);
    }
    
}
