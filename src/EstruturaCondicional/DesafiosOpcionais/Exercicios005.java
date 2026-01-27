package EstruturaCondicional.DesafiosOpcionais;

import java.util.Scanner;

public class Exercicios005 {
    public static void main(String[] args) {
        /*Com base na tabela abaixo, escreva um programa que leia o código de um item
e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

  CODIGO	    ESPECIFICAÇÃO	        PREÇO

    1	        Cachorro Quente	        R$ 4,00
    2	        X-Salada	            R$ 4,50
    3	        X-Bacon	                R$ 5,00
    4	        Torrada simples	        R$ 2,00
    5	        Refrigerante	        R$ 1,50*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a code: ");
        int codigo = scanner.nextInt();
        System.out.print("Enter a specification: ");
        double quantity = scanner.nextDouble();

        double sum = -1;
        switch (codigo) {
            case 0:
                System.out.println("The code is illegal");
            case 1:
                sum = 4.00 * quantity;
                break;
            case 2:
                sum = 4.50 * quantity;
                break;
            case 3:
                sum = 5.00 * quantity;
                break;
            case 4:
                sum = 2.00 * quantity;
                break;
            case 5:
                sum = 1.50 * quantity;
                break;
        }
        System.out.println("The total for your order is R$"+sum);
    }
}
