package ProgramacaoOrientadaObjetos.Desafios.Fixacao01.Application;

import ProgramacaoOrientadaObjetos.Aula1.Exemplo001.entities.Triangle;
import ProgramacaoOrientadaObjetos.Aula1.Exemplo002.entities.Product;
import ProgramacaoOrientadaObjetos.Desafios.Fixacao01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ApplicationRectangle {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter Rectangle data:");
        System.out.print("Width( Largura ): ");
        rectangle.width = scanner.nextDouble();
        System.out.print("height( Altura ): ");
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);

    }
}
