package Design_patterns.Strategy_Factory_Observer;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(400, 200, "Calin", "Calinescu");
        Person p2 = new Person(300, 200, "George", "Alexandru");
        Person p3 = new Person(200, 300, "Teodor", "Stefan");
        Shop shop = new Shop(100);
        Shop shop2 = new Shop(200);

        shop.createTransaction(p);
        shop2.createTransaction(p2);
        shop.createTransaction(p3);
    }
}
