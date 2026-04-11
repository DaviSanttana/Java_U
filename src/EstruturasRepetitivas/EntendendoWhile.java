package EstruturasRepetitivas;

import java.util.Scanner;

public class EntendendoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int soma = 0;
        while (numero != 0) {
            soma += numero;
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("A soma é: "+ soma);
        }
    }

