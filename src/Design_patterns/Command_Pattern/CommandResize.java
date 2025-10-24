package Design_patterns.Command_Pattern;

public class CommandResize implements DrawCommand {
    DiagramComponent component;
    int previousLength;
    int nextLength;
    int previousWidth;
    int nextWidth;

    public CommandResize(int length, int width, DiagramComponent component) {
        this.component = component;
        this.nextLength = length;
        this.nextWidth = width;

    }


    @Override
    public void execute() {
        this.previousLength = component.getLength();
        component.setLength(this.nextLength);
        this.previousWidth = component.getWidth();
        component.setWidth(this.nextWidth);
    }

    @Override
    public void undo() {
        this.nextLength = this.previousLength;
        component.setLength(this.nextLength);
        this.nextWidth = this.previousWidth;
        component.setWidth(this.nextWidth);
    }
}
