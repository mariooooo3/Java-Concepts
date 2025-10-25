package Collections;

public class Main {
    public static void main(String[] args) {
        EvenLinkedHashSet even = new EvenLinkedHashSet();
        even.add(1);
        even.add(2);
        even.add(3);
        even.add(4);

        EvenTreeSet tree = new EvenTreeSet();
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);

        EvenHashSet hash = new EvenHashSet();
        hash.add(9);
        hash.add(10);
        hash.add(11);
        hash.add(12);

        System.out.println("\n" + even);
        System.out.println("\n" + tree);
        System.out.println("\n" + hash);
    }
}
