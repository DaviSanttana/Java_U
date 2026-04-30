package ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao03.entities;

public class Student {
    public String name;
    public int firstTrimester;
    public int secondTrimester;
    public int thirdTrimester;


    public int finalGrade() {
        return firstTrimester + secondTrimester + thirdTrimester;
    }

    public int passOrFailed() {
        if (finalGrade() < 60) {
            return 60 - finalGrade();
        } else {
            return 0;
        }
    }
}
