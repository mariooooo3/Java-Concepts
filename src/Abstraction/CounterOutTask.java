package Abstraction;


public class CounterOutTask implements Task {
    public static int contor;

    public CounterOutTask() {
        contor++;
    }

    @Override
    public void execute() {
        System.out.println("Contorul este egal cu:" + contor);
    }

}
