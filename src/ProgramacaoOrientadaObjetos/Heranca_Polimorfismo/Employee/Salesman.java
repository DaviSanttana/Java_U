package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Employee;

public non-sealed class Salesman extends Employee {
    private double percentPerSold;
    private double soldAMount;

    public Salesman(String code,
                    String name,
                    String adress,
                    int age,
                    double salary,
                    double percentPerSold,
                    double soldAMount) {
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAMount = soldAMount;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((soldAMount * percentPerSold) / 100);
    }

    public Salesman() {
    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAMount() {
        return soldAMount;
    }

    public void setSoldAMount(double soldAMount) {
        this.soldAMount = soldAMount;
    }
}
