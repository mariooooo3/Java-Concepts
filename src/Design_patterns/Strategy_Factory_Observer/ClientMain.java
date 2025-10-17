package Design_patterns.Strategy_Factory_Observer;

public class ClientMain {
    public static void main(String[] args) {
        Client c = new Client("Raul", "Ionescu", 22);
        Client c2 = new Client("Mario", "Grifore",  21);
        c.getPaymentMethod(c);
        c2.getPaymentMethod(c2);
    }
}
