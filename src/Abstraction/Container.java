package Abstraction;


public interface Container {
    Task pop();

    void push(Task task);

    int size();

    boolean isEmpty();

    void transferFrom(Container c);

}
