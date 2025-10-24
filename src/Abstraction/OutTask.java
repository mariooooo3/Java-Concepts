package Abstraction;


public class OutTask implements Task {
    public String mesaj;

    public OutTask(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void execute() {
        System.out.println(mesaj);
    }

}
