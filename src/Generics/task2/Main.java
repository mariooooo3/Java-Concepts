
package Generics.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;




class Node<T extends Comparable<T>> {

    private T value;
    private Node<T> right;
    private Node<T> left;

    public Node()
    {

    }

    public Node(T value, Node<T> right, Node<T> left)
    {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public void setValue(T value)
    {
        this.value = value;
    }

    public T getValue()
    {
        return this.value;
    }

    public void setRight(Node<T> right)
    {
        this.right = right;
    }

    public void setLeft(Node<T> left)
    {
        this.left = left;
    }

    public Node<T> getRight()
    {
        return this.right;
    }

    public Node<T> getLeft()
    {
        return this.left;
    }
}


interface Tree<T extends Comparable<T>> {

    void addValue(T value);

    void addAll(List<T> values);

    HashSet<T> getValues(T inf, T sup);

    int size();

    boolean isEmpty();
}

class TreeImpl<T extends Comparable<T>> implements Tree<T> {

    public Node<T> root;
    int size = 0;

    public Node<T> insert(Node<T> node, T value)
    {
        if (node == null) {
            size++;
            return new Node<>(value, null, null);
        }
        int cmp = value.compareTo(node.getValue());
        if (cmp < 0) {
            node.setLeft(insert(node.getLeft(), value));
        } else if (cmp > 0) {
            node.setRight(insert(node.getRight(), value));
        }
        return node;
    }

    private void getValuesRec(Node<T> node, T inf, T sup, HashSet<T> result) {
        if (node == null) return;

        if (node.getValue().compareTo(inf) > 0) {
            getValuesRec(node.getLeft(), inf, sup, result);
        }

        if (node.getValue().compareTo(inf) >= 0 && node.getValue().compareTo(sup) <= 0) {
            result.add(node.getValue());
        }

        if (node.getValue().compareTo(sup) < 0) {
            getValuesRec(node.getRight(), inf, sup, result);
        }
    }

    @Override
    public void addValue(T value) {
        root = insert(root, value);
    }

    @Override
    public void addAll(List<T> values) {
        for (T value : values) {
            addValue(value);
        }
    }

    @Override
    public HashSet<T> getValues(T inf, T sup) {
        HashSet<T> result = new HashSet<>();
        getValuesRec(root, inf, sup, result);
        return result;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}

class Student implements Comparable<Student> {
    private final Float grade;

    public Student(Float grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student student) {
        return this.grade.compareTo(student.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                '}';
    }
}

public class Main {

    private static Integer testNr = 0;

    public static void main(String[] args) {

        final Tree<Student> tree = new TreeImpl<>();
        final List<Student> studentList = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            studentList.add(createGenericStudent((float) i));
        }

        printTestNr(); // 1
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 2
        for (int i = 0; i < 5; i++) {
            tree.addValue(createGenericStudent((float) i));
        }
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 3
        tree.addAll(studentList);
        System.out.println(tree.isEmpty());
        System.out.println(tree.size());
        System.out.println();

        printTestNr(); // 4
        final Student studentThatPassedExam = new Student(5.0f);
        final Student studentThatWorkedHardToPassTheExam = new Student(10.0f);
        final HashSet<Student> values = tree.getValues(studentThatPassedExam, studentThatWorkedHardToPassTheExam);
        System.out.println(values.size());
        values.stream().sorted().forEach(System.out::println);
    }

    private static void printTestNr() {
        System.out.println("TEST " + ++testNr + " result:");
    }

    private static Student createGenericStudent(final Float grade) {
        return new Student(grade);
    }
}
