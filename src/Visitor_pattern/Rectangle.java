package Visitor_pattern;

public class Rectangle implements Shape {
    int size;
    String color;

    public Rectangle(int size, String color) {
        this.size = size;
        this.color = color;

    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
