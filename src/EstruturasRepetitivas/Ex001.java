package EstruturasRepetitivas;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senhaUsuario = sc.nextInt();
        int senhaReal = 2290;
        while (senhaUsuario != senhaReal) {
            System.out.println("Senha invalida, acesso negado");
            senhaUsuario = sc.nextInt();
        }
        sc.close();
        System.out.println("Acesso permitido");

    }
}

