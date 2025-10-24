package Visitor_pattern;

public class TextVisitor implements Visitor {
    public void visit(Dot dot) {
        System.out.println("Marimea punctului este " + dot.size +
                " iar culoarea lui este " + dot.color);
    }

    public void visit(Rectangle rectangle) {
        System.out.println("Marimea dreptunghiului este " + rectangle.size
                + " iar culoarea lui este " + rectangle.color);
    }

    public void visit(Circle circle) {
        System.out.println("Raza cercului este " + circle.radius
                + " iar culoarea lui este " + circle.color);
    }

}
