package ProgramacaoOrientadaObjetos.Heranca_Polimorfismo.Employee;

public class Main {

    static void main() {
        printEmployee(new Maneger());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Maneger manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joao23");
                manager.setPassword("23234");
                manager.setComission(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
                System.out.println(manager.getFullSalary(500));
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
