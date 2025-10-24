package Polymorphism;


public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Dragos", 6000, 31);
        Employee e2 = new Employee("Razor", 3000, 23);
        Manager m = new Manager(2);
        Developer d = new Developer(4, "Iustin");
        Manager m2 = new Manager(3);

        System.out.println("1:" + e.toString());
        System.out.println("2:" + m.toString());
        System.out.println("Bonusul unui Manager este:" + m.calculateBonus());

        d.showDetails();
        m2.validateEmployee();
        m2.compareSalary(d);

    }

}
