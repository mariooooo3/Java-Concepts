package Design_patterns.Command_Pattern;

import java.util.ArrayList;

public class DiagramCanvas {

    ArrayList<DiagramComponent> components = new ArrayList<>();

    public void DrawRectangle(String color, String text, int length, int width) {
        DiagramComponent rectangle = new DiagramComponent(color, text, length, width);
        components.add(rectangle);
    }

}

