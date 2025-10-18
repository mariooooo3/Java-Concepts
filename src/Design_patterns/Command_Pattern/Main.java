package Design_patterns.Command_Pattern;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        DiagramCanvas canvas = new DiagramCanvas();
        canvas.DrawRectangle("Albastru", "Rar", 200, 300);
        canvas.DrawRectangle("Galben", "Extra-Rar", 400, 500);
        canvas.DrawRectangle("Rosu", "Comun", 100, 200);

        System.out.println("Initializare:\n");
        DiagramComponent c1 = canvas.components.get(0);
        System.out.println("c1" + c1);
        DiagramComponent c2 = canvas.components.get(1);
        System.out.println("c2" + c2);
        DiagramComponent c3 = canvas.components.get(2);
        System.out.println("c3" + c3);

        System.out.println("Modificari:\n");

        DrawCommand changeColor = new CommandColor(c1, "Roz");
        editor.execute(changeColor);
        DrawCommand changeText = new CommandText(c1, "Extra-Comun");
        editor.execute(changeText);
        DrawCommand changeSize = new CommandResize(50, 100, c1);
        editor.execute(changeSize);
        System.out.println("c1" + c1);

        DrawCommand changeColor2 = new CommandColor(c2, "Auriu");
        editor.execute(changeColor2);
        System.out.println("c2" + c2);

        DrawCommand changeSize3 = new CommandResize(700, 800, c3);
        editor.execute(changeSize3);
        DrawCommand changeText3 = new CommandText(c3, "Legendar");
        editor.execute(changeText3);
        System.out.println("c3" + c3);

        System.out.println("Undo:\n");

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        System.out.println("c3" + c3);
        System.out.println("c2" + c2);
        System.out.println("c1" + c1);

    }
}
