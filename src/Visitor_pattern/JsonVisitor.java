package Visitor_pattern;

public class JsonVisitor implements Visitor {
    public void visit(Rectangle rectangle) {
        System.out.println("{");
        System.out.println("'Rectangle' : {");
        System.out.println("   'size':" + rectangle.size);
        System.out.println("   'color':" + rectangle.color);
        System.out.println("}");
    }

    public void visit(Circle circle) {
        System.out.println("{");
        System.out.println("'Circle' : {");
        System.out.println("   'radius':" + circle.radius);
        System.out.println("   'color':" + circle.color);
        System.out.println("}");
    }

    public void visit(Dot dot) {
        System.out.println("{");
        System.out.println("'Dot' : {");
        System.out.println("   'size':" + dot.size);
        System.out.println("   'color':" + dot.color);
        System.out.println("}");
    }
}
