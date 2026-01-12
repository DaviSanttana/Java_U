package EstruturaSequencial.Exercise;

import java.util.Scanner;

public class EntradaDeDados004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = sc.next();

        String palavraInvertida = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            palavraInvertida += word.charAt(i);
        }
        System.out.println(palavraInvertida);

        sc.close();
    }
}
