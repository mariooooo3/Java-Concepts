package DataStructures;


import java.util.ArrayList;
import java.util.LinkedList;

class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int data) {
        stack.add(data);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stiva este goala");
            return 0;
        }
        return stack.remove(stack.size() - 1);
    }

    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stiva este goala");
            return 0;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean esteGoala() {
        return stack.isEmpty();
    }

}

class Stiva {
    LinkedList<Integer> stiva = new LinkedList<>();

    public void push(int data) {
        stiva.addLast(data);
    }

    public int pop() {
        if (stiva.isEmpty()) {
            System.out.println("Stiva2 este goala");
            return 0;
        }
        return stiva.removeLast();
    }

    public int peek() {
        if (stiva.isEmpty()) {
            System.out.println("Stiva2 este goala");
            return 0;
        }
        return stiva.getFirst();
    }

    public boolean esteGoala() {
        return stiva.isEmpty();
    }

}

public class StackImplementation {
    public static void main(String[] args) {
        Stack stackArray = new Stack();
        Stiva stivaLinked = new Stiva();

        long startTime = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            stackArray.push(i);
        }

        long stopTime = System.nanoTime();
        long totalTime = stopTime - startTime;
        System.out.println("stiva cu ArrayList push time: " + totalTime / 1000000 + " milisecunde");

        long startTime2 = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            stivaLinked.push(i);
        }

        long stopTime2 = System.nanoTime();
        long totalTime2 = stopTime2 - startTime2;
        System.out.println("stiva cu LinkedList push time: " + totalTime2 / 1000000 + " milisecunde");

        long startTime3 = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            stackArray.pop();
        }

        long stopTime3 = System.nanoTime();
        long totalTime3 = stopTime3 - startTime3;
        System.out.println("stiva cu ArrayList pop time: " + totalTime3 / 1000000 + " milisecunde");

        long startTime4 = System.nanoTime();

        for (int i = 0; i < 1000000; i++) {
            stivaLinked.pop();
        }

        long stopTime4 = System.nanoTime();
        long totalTime4 = stopTime4 - startTime4;
        System.out.println("stiva cu LinkedList pop time: " + totalTime4 / 1000000 + " milisecunde");

    }
}