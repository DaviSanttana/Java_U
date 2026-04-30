package ProgramacaoOrientadaObjetos.Aula1.Desafios.Fixacao02.entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    private double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += grossSalary * percentage / 100;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", $" + netSalary();
    }
}
