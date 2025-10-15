package Abstraction;


import java.util.LinkedList;
import java.util.ArrayList;

public class Queue implements Container {
    private LinkedList<Task> tasks = new LinkedList<>();
    private ArrayList<Task> tasks1 = new ArrayList<>();

    @Override
    public Task pop() {
        if (!tasks.isEmpty()) {
            return tasks.removeFirst(); // scoate primul element
        }
        return null;
    }

    @Override
    public void push(Task task) {
        if (task != null) {
            tasks.addLast(task); // adaugă la final
        }
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    @Override
    public void transferFrom(Container c) {
        while (!c.isEmpty()) {
            this.push(c.pop());
        }
    }
}

