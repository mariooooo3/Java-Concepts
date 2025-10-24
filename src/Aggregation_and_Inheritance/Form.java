package Aggregation_and_Inheritance;

public class Form {
    private String color;

    public Form() {
        this.color = "white";
    }

    public Form(String col) {
        this.color = col;
    }

    public float getArea() {
        return 0;
    }

    public String toString() {
        return "This form has the color " + this.color;
    }

    public boolean equals(Form f) {
        return true;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof Form)) {
            return false;
        }
        return equals((Form) o);
    }

}


class Square extends Form {
    float side;

    public Square() {
        super("rosu");
    }

    @Override
    public float getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLatura patratului este:" + side;

    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Square))
            return false;

        return equals((Square) o);
    }

    public void printSquareDimensions() {
        System.out.println("Latura patratului este:" + side);
    }

    public void printPerimeter() {
        System.out.println("Perimetrul patratului:" + side * side);
    }

}


class Triangle extends Form {
    float height;
    float base;

    public Triangle() {
        super("albastru");
    }

    @Override
    public float getArea() {
        return height * base;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBasa cercului triunghiului este:" + base + ", iar inaltimea:" + height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Triangle))
            return false;

        return equals((Triangle) o);
    }

    public void printTriangleDimensions() {
        System.out.println("Inaltimea triunghiului este:" + height + ", iar baza este:" + base);
    }

    public void printPerimeter() {
        System.out.println("Perimetrul triunghiului:" + height * base);
    }

}

class Circle extends Form {
    float radius;

    public Circle() {
        super("galben");
    }

    @Override
    public float getArea() {
        return radius * radius * (float) Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaza cercului este:" + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Circle))
            return false;

        return equals((Circle) o);
    }

    public void printCircleDimensions() {
        System.out.println("Raza cercului este:" + radius);
    }

    public void printPerimeter() {
        System.out.println("Perimetrul cercului:" + radius * radius);
    }

}