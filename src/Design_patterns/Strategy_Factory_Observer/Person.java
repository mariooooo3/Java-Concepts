package Design_patterns.Strategy_Factory_Observer;

public class Person extends Client implements BalanceObserver {
    double balance;
    double limit;
    String name;
    String surname;

    public Person(double balance, double limit, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.limit = limit;

    }

    public void update() {
        if (balance < limit)
            System.out.println("Clientul " + name + " " + surname +
                    " a ramas fara suficienti bani in cont");
        else
            System.out.println("Clientul " + name + " " + surname + " are posibilitattea de a mai face plati");
    }

    public void payBy(Person p) {
        if (balance > limit)
            getPaymentMethod(p);
        else
            System.out.println("Persoana " + name + " " + surname + " "
                    + " nu are bani sa efectueze plata");

    }
}
