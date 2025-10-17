package Design_patterns.Strategy_Factory_Observer;

import java.util.Random;

import Design_patterns.Strategy_Factory_Observer.PaymentStrategy;

public class Client {
    public String name;
    public String surname;
    public int age;

    public Client() {

    }

    public Client(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public class Voucher implements PaymentStrategy {
        int voucherNo;

        public Voucher(int voucherNo) {
            this.voucherNo = voucherNo;
        }

        public void pay() {
            System.out.println("Voucher " + this.voucherNo + " payed");
        }
    }

    public class IBAN implements PaymentStrategy {
        int ibanNo;

        public IBAN(int ibanNo) {
            this.ibanNo = ibanNo;
        }

        public void pay() {
            System.out.println("IBAN " + this.ibanNo + " payed");
        }
    }

    public class creditCard implements PaymentStrategy {
        int credNo;

        public creditCard(int credNo) {
            this.credNo = credNo;
        }

        public void pay() {
            System.out.println("Credit Card " + this.credNo + " payed");
        }
    }

    public void getPaymentMethod(Client c) {
        Random r = new Random();
        int choice = r.nextInt(3);

        PaymentStrategy pay;

        switch (choice) {
            case 0:
                pay = c.new Voucher(123);
                break;
            case 1:
                pay = c.new IBAN(349);
                break;
            case 2:
                pay = c.new creditCard(349);
                break;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
        pay.pay();
    }
}
