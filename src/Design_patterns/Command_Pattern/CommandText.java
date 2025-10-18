package Design_patterns.Command_Pattern;

public class CommandText implements DrawCommand {
    DiagramComponent component;
    String previousText;
    String nextText;

    public CommandText(DiagramComponent component, String text) {
        this.component = component;
        this.nextText = text;
    }

    @Override
    public void execute() {
        this.previousText = this.component.getText();
        component.setText(this.nextText);
    }

    @Override
    public void undo() {
        this.nextText = this.previousText;
        component.setText(this.nextText);
    }
}
