package DataStructures;


import java.util.ArrayList;
import java.util.LinkedList;

class Queue {
    ArrayList<Integer> queue = new ArrayList<>();

    public void enqueue(int data) {
        queue.add(data);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Coada este goala");
            return 0;
        }
        return queue.remove(0);
    }

    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Coada este goala");
            return 0;
        }
        return queue.get(0);
    }

    public boolean esteGoala() {
        return queue.isEmpty();
    }

}

class Coada {
    LinkedList<Integer> coada = new LinkedList<>();

    public void enqueue(int data) {
        coada.add(data);
    }

    public int dequeue() {
        if (coada.isEmpty()) {
            System.out.println("Coada este goala");
            return 0;
        }
        return coada.removeFirst();
    }

    public int peek() {
        if (coada.isEmpty()) {
            System.out.println("Coada este goala");
            return 0;
        }
        return coada.getFirst();
    }

    public boolean esteGoala() {
        return coada.isEmpty();
    }

}

public class QueueImplementation {
    public static void main(String[] args) {

        Queue queueArray = new Queue();
        Coada coadaLinked = new Coada();

        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            queueArray.enqueue(i);
        }

        long stopTime = System.nanoTime();
        long totalTime = stopTime - startTime;
        System.out.println("coada cu ArrayList push time: " + totalTime / 1000000 + " milisecunde");

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            coadaLinked.enqueue(i);
        }

        long stopTime2 = System.nanoTime();
        long totalTime2 = stopTime2 - startTime2;
        System.out.println("coada cu LinkedList push time: " + totalTime2 / 1000000 + " milisecunde");

        long startTime3 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            queueArray.dequeue();
        }

        long stopTime3 = System.nanoTime();
        long totalTime3 = stopTime3 - startTime3;
        System.out.println("coada cu ArrayList pop time: " + totalTime3 / 1000000 + " milisecunde");

        long startTime4 = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            coadaLinked.dequeue();
        }

        long stopTime4 = System.nanoTime();
        long totalTime4 = stopTime4 - startTime4;
        System.out.println("coada cu LinkedList pop time: " + totalTime4 / 1000000 + " milisecunde");
    }
}

