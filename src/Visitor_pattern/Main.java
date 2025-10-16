package Visitor_pattern;

public class Main {
    public static void main(String[] args) {
        Dot d = new Dot(30, "Rosu");
        Rectangle r = new Rectangle(20, "Galben");
        Circle c = new Circle(40, "Albastru");

        JsonVisitor j = new JsonVisitor();
        r.accept(j);
        c.accept(j);

        TextVisitor t = new TextVisitor();
        d.accept(t);

    }
}
