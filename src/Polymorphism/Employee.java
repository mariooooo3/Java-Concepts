package Polymorphism;


public class Employee {
    private String name;
    private double salary;
    private int age;

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Nume:" + name + "\nSalariu" + salary + "\nAge" + age;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public void validateEmployee() {
        if (salary < 0)
            System.out.println("Salariul nu poate fi mai mic decat 0");

        if (age < 0)
            System.out.println("Angajatul trebuie sa aiba cel putin 18 ani");
    }

    public void showDetails() {
        System.out.println("Employee details:");
    }

    public int compareSalary(Employee e) {
        if (salary > e.salary) {
            System.out.println(this.name + " Are un salariu mai mare");
            return 1;
        }
        if (salary == e.salary) {
            System.out.println("Amandoi au acelasi salariu");
            return 0;
        }
        if (salary < e.salary) {
            System.out.println(e.name + " Are un salariu mai mare");
            return -1;
        }

        return 0;
    }

}

class Manager extends Employee {
    private int m;
    static int contor;

    public Manager() {
        super("Clapa", 4000, 20);
    }

    public Manager(int m) {
        super("Teo", 2500, 27);
        this.m = m;
    }

    @Override
    public String toString() {
        return super.toString() + "Position:Manager";
    }

    @Override
    public double calculateBonus() {
        return super.getSalary() * 0.2;
    }

    public int getM() {
        return m;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee details: Manager of: " + m + " employees");
    }

    @Override
    public void validateEmployee() {
        if (m < 0)
            System.out.println("Number of employees managed must be 1 or greater");
    }

    public double calculateBonus(int bonus) {
        return super.getSalary() * 0.2 + bonus * m;

    }


}


class Developer extends Employee {
    private int d;
    static int contor;

    public Developer() {
        super("Andro", 5000, 24);
    }

    public Developer(int d, String nume) {
        super(nume, 4500, 22);
        this.d = d;
    }

    @Override
    public String toString() {
        return super.toString() + "POsition:Developer";
    }

    @Override
    public double calculateBonus() {
        return super.getSalary() * 0.15;
    }

    public int getD() {
        return d;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee details: Developer with:" + d + " projects");
    }

    @Override
    public void validateEmployee() {
        if (d < 0)
            System.out.println("Number of projects must be 1 or greater");
    }

    public double calculateBonus(int bonus) {
        return super.getSalary() * 0.15 + bonus * d;
    }

}


