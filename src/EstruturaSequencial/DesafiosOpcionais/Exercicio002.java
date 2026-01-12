package EstruturaSequencial.DesafiosOpcionais;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius, elevation;
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        elevation = 2.0;

        double valuePi = 3.14159;
        double area = valuePi * (Math.pow(radius, elevation));

        System.out.printf("The value of the area is %.4f%n ", area);

        sc.close();
    }
}
