package EstruturaSequencial_Section_4.Exercise;

import java.util.Scanner;

public class EntradaDeDados001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        System.out.println("You typed "+n1);

        sc.close();
    }
}
