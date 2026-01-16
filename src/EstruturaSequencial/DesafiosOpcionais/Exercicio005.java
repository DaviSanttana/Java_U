package EstruturaSequencial.DesafiosOpcionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.print("What is the first number: (EX: 2.00)");
        A = sc.nextDouble();
        System.out.print("What is the second number: (EX: 2.00)");
        B = sc.nextDouble();
        System.out.print("What is the third number:  (EX: 2.00)");
        C = sc.nextDouble();

        //TRIANGLE
        double areaTriangle = (A * C) / 2;

        //Circle
        double elevation = 2.0;
        double valuePi = 3.14159;
        double areaCircle = valuePi * (Math.pow(C, elevation));

        //Trapezoid
        double trapezoid = (A + B) * C / 2;

        //Square
        double square = B * B;

        double rectangle = A * B ;

        System.out.printf("Triangle: %.4f%n",areaTriangle);
        System.out.printf("Circle: %.4f%n",areaCircle);
        System.out.printf("Trapezoid: %.4f%n",trapezoid);
        System.out.printf("Square: %.4f%n",square);
        System.out.printf("Square: %.4f%n",rectangle);

        sc.close();
    }
}
