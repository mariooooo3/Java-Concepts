package Visitor_pattern;

public class Circle implements Shape {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}
