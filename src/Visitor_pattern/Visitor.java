package Visitor_pattern;

import java.awt.*;

public interface Visitor {
    public void visit(Dot dot);

    public void visit(Rectangle rectangle);

    public void visit(Circle circle);
}
