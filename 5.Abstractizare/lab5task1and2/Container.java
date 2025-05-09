package lab5task1and2;

public interface Container
{
    Task pop();
    void push(Task task);
    int size();
    boolean isEmpty();
    void transferFrom(Container c);

}
