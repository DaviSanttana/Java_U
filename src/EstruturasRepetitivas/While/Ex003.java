package EstruturasRepetitivas.While;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCombustivel = sc.nextInt();// 1-Alcool | 2-Gasolina | 3-Diesel | 4-Fim
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (tipoCombustivel != 4) {
            if (tipoCombustivel == 1) {
                alcool += 1;
            } else if (tipoCombustivel == 2) {
                gasolina += 1;
            } else if(tipoCombustivel == 3){
                diesel += 1;
            }
            tipoCombustivel = sc.nextInt();

        }
        sc.close();
        System.out.println("Muito obrigado\nAlcool: " + alcool + "\nGasolina: " + gasolina + "\nDiesel: " + diesel);
    }
}
