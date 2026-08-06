package Vetores.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class Ex004 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rent[] quartos = new Rent[10];

        System.out.print("How many rooms will be rented?");
        int nQuartos = scanner.nextInt();

        for (int i = 0; i < nQuartos; i++) {
            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Email: ");
            String email= scanner.next();
            System.out.print("Room: ");
            int room= scanner.nextInt();

            quartos[room] = new Rent(name, email);

        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].toString());
            }
        }

    }
}
