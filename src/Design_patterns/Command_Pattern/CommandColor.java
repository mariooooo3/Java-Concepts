package Design_patterns.Command_Pattern;

public class CommandColor implements DrawCommand {
    DiagramComponent component;
    String previousColor;
    String nextColor;

    public CommandColor(DiagramComponent component, String color) {
        this.component = component;
        this.nextColor = color;
    }

    @Override
    public void execute() {
        this.previousColor = component.getColor();
        component.setColor(this.nextColor);
    }

    @Override
    public void undo() {
        this.nextColor = this.previousColor;
        component.setColor(this.nextColor);
    }
}
