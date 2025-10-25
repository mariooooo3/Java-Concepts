package Collections;

import java.util.TreeSet;

public class EvenTreeSet extends Even {

    private TreeSet<Integer> tree = new TreeSet<>();

    @Override
    public void addEven(Integer x) {
        tree.add(x);
    }

    @Override
    public String toString() {
        return "EvenTreeSet [tree=" + tree + "]";
    }
}
