package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Employee;

public non-sealed class Maneger extends Employee {
    private String login;
    private String password;
    private double comission;

    public Maneger(String code,
                   String name,
                   String adress,
                   int age,
                   double salary,
                   String login,
                   String password,
                   double comission) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.comission = comission;
    }

    @Override
    public String getCode() {
        return "MN" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.comission;
    }

    public double getFullSalary(double extra) {
        return getFullSalary() + extra;
    }

    public Maneger() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
}
