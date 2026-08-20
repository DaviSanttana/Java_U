package Listas.Aula;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        Employees[] vec = new Employees[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            System.out.println("------------");
            vec[i] = new Employees(id, name, salary);
        }
        System.out.print("Enter the employee id tht have salary increase: ");
        int increaseId = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentageSalary = sc.nextDouble();

        Employees employeesSearch = null;
        for (Employees emp : vec) {
            if (emp.getId() == increaseId) {
                employeesSearch = emp;
                break;
            }
        }
        if (employeesSearch != null) {
            employeesSearch.increaseSalaryByPercentage(percentageSalary);
        }

        System.out.println("List of Employees: ");
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] != null) {
                System.out.println(vec[i].toString());
            }
        }

    }
}
