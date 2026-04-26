package ProgramacaoOrientadaObjetos.Aula1.Exemplo002.application;

import ProgramacaoOrientadaObjetos.Aula1.Exemplo002.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scanner.nextLine();
        System.out.print("Price: ");
        product.price = scanner.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println("Product data: "+product);

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Update data: "+product);


        System.out.println("Enter the number of products to be remove in stock: ");
        int quantityRemove = scanner.nextInt();
        product.removeProducts(quantityRemove);
        System.out.println();
        System.out.println("Update data: "+product);


    }
}