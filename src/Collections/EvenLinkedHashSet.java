package Collections;

import java.util.LinkedHashSet;

public class EvenLinkedHashSet extends Even {

    public LinkedHashSet<Integer> even = new LinkedHashSet<>();

    @Override
    public void addEven(Integer x) {
        even.add(x);
    }

    @Override
    public String toString() {
        return "EvenLinkedHashSet [even=" + even + "]";
    }

}
