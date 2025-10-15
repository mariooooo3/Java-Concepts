package Abstraction;


public class Main {
    public static void main(String[] args) {   //task1
        OutTask o = new OutTask("OutTask implements Task");
        RandomOutTask r = new RandomOutTask();
        CounterOutTask c = new CounterOutTask();
        CounterOutTask c1 = new CounterOutTask();
        CounterOutTask c2 = new CounterOutTask();

        o.execute();
        r.execute();
        c2.execute();
        //task 2

        System.out.println("TASK 2\n");

        Stack stack = new Stack();
        stack.push(c1);
        stack.push(c);
        stack.pop().execute();
        System.out.println(stack.isEmpty());

        Queue queue = new Queue();
        queue.push(o);
        queue.push(r);
        queue.pop().execute();
        System.out.println("Lungimea cozii este de:" + stack.size());
    }


}
