package Visitor_pattern;

public class Dot implements Shape {

    int size;
    String color;

    public Dot(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

}
