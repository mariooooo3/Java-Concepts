package Constructors_references_static;

public class MainComplex {
    public static void main(String[] args) {
        Complex c = new Complex();
        Complex c1 = new Complex(2, 5);
        Complex c2 = new Complex(2, -1);
        Complex c3 = c2;
        Complex c4 = new Complex(10, -10);
        Complex c5 = new Complex(1, 0);

        c2.setImaginary(7);
        System.out.println("Valoarea lui c1 este:" + c1.getReal());

        c2.showNumber();
        c1.showNumber();
        c3.showNumber();
        c4.showNumber();
        c5.showNumber();
    }
}

