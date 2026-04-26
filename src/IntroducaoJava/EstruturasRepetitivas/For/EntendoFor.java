package IntroducaoJava.EstruturasRepetitivas.For;

import java.util.Scanner;

public class EntendoFor {
    /*
    for ( inicio; condição ; incremento ){
        comando1
        comando2
    }
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos numeros quer adicionar para somar? ");
        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("A soma de todos os numeros vale: "+soma);
        sc.close();
    }
}
