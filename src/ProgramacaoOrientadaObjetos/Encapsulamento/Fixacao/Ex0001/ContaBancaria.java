package ProgramacaoOrientadaObjetos.Encapsulamento.Fixacao.Ex0001;

import java.util.Scanner;

public class ContaBancaria {
    private static int accountNumber;
    private String accountHolder;
    private Boolean depositInitial;
    private double balance = 0;

    public ContaBancaria() {
    }

    @Override
    public String toString() {
        return "Account data:\n" +"Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: R$" + balance;
    }

    static void main() {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        conta.accountNumber = scanner.nextInt();
        System.out.print("Enter account holder: ");
        conta.accountHolder = scanner.next();
        System.out.print("Is there na initial deposit (y/n) ");
        String respost = scanner.next();
        conta.depositInitial = respost.equalsIgnoreCase("y");
        if (conta.depositInitial == true) {
            System.out.println("Enter initial deposit value: ");
            conta.balance = scanner.nextDouble();
            System.out.println(conta);
        }else {
            System.out.println(conta);
        }
    }

}
