package Abstraction.task2;


public class Main {
    public static void main(String[] args) {
        Operation op = new Operation(100);

        op.plus(100);
        System.out.println("Dupa adunare numarul este: " + op.getNumber());

        op.minus(150);
        System.out.println("Dupa scadere numarul este: " + op.getNumber());

        op.mult(75);
        System.out.println("Dupa inmultire numarul este: " + op.getNumber());

        op.div(25);
        System.out.println("Dupa impartire numarul este: " + op.getNumber());

        op.div(0);
    }

}
