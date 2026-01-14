package EstruturaSequencial.DesafiosOpcionais;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idEmployee, hoursWorked;
        double valuePerHours, salary;

        System.out.print("What is the employee ID? ");
        idEmployee = sc.nextInt();
        System.out.print("How many hours worked this month? ");
        hoursWorked = sc.nextInt();
        System.out.print("What is value per hours? ");
        valuePerHours = sc.nextDouble();

        salary = hoursWorked * valuePerHours;

        System.out.println("Number employee is: "+idEmployee);
        System.out.printf("He must receive: R$%.2f%n ", salary);

        sc.close();
    }
}
