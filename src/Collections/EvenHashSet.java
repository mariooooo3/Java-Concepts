package Collections;

import java.util.HashSet;

public class EvenHashSet extends Even {
    private HashSet<Integer> hash = new HashSet<>();

    @Override
    public void addEven(Integer x) {
        hash.add(x);
    }

    @Override
    public String toString() {
        return "EvenLinkedHashSet [hash=" + hash + "]";
    }
}
