package Abstraction;


import java.util.LinkedList;

public class Stack implements Container {
    private LinkedList<Task> tasks = new LinkedList<>();

    @Override
    public Task pop() {
        if (!tasks.isEmpty()) {
            return tasks.removeLast(); // scoate ultimul element (LIFO)
        }
        return null;
    }

    @Override
    public void push(Task task) {
        if (task != null) {
            tasks.addLast(task); // adaugă la final (ca să scoatem ușor)
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

