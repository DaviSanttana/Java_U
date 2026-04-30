package ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao03.application;

import ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao03.entities.Student;

import java.util.Scanner;

public class NotesFInal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter data the student: ");
        System.out.print("Name: ");
        student.name = scanner.nextLine();
        System.out.print("First semester: ");
        student.firstTrimester = scanner.nextInt();
        System.out.print("Second semester: ");
        student.secondTrimester = scanner.nextInt();
        System.out.print("Third semester: ");
        student.thirdTrimester = scanner.nextInt();

        System.out.println("FINAL GRADE: "+ student.finalGrade());


        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING POINTS", student.passOrFailed());
        } else {
            System.out.println("PASS");
        }
        scanner.close();
    }

}

