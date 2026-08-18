package Listas.Aula;

public class Employees {
    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalaryByPercentage(double percentage) {
        this.salary += this.salary * (percentage / 100.0);
    }

    @Override
    public String toString() {
        return "Id: " + id + ", " + name + ", " + salary;
    }
}
