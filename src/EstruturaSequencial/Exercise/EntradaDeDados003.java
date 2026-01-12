package EstruturaSequencial.Exercise;

import java.util.Scanner;

public class EntradaDeDados003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.next();
        System.out.print("How old are you? ");
        int age = sc.nextInt();

        System.out.println("Good morning "+name+ ", you are "+age + " years old");

        sc.close();
    }
}
