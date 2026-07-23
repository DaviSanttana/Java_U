package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Employee;

public class Main {

    static void main() {
        printEmployee(new Maneger());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Maneger maneger -> {
                maneger.setCode("123");
                maneger.setName("João");
                maneger.setSalary(5000);
                maneger.setLogin("joao23");
                maneger.setPassword("23234");
                maneger.setComission(1200);

                System.out.println(maneger.getCode());
                System.out.println(maneger.getName());
                System.out.println(maneger.getSalary());
                System.out.println(maneger.getLogin());
                System.out.println(maneger.getPassword());
                System.out.println(maneger.getComission());
                System.out.println(maneger.getFullSalary(500));
            }
            case Salesman salesman -> {
                salesman.setCode("234");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentPerSold(10);
                salesman.setSoldAMount(1000);


                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAMount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println("===============");
    }


}
