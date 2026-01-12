package EstruturaSequencial_Section_4.Exercise;

import java.util.Scanner;

public class EntradaDeDados002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("The sum is: "+sum);

        sc.close();
    }
}
