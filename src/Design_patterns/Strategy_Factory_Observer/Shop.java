package Design_patterns.Strategy_Factory_Observer;

public class Shop implements TransactionPublisher {
    int price;

    public Shop(int price) {
        this.price = price;
    }

    public void createTransaction(Person p) {

        if (p.balance > p.limit) {
            p.payBy(p);
            p.balance -= price;
            p.update();
        }
    }
}
