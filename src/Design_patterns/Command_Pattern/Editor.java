package Design_patterns.Command_Pattern;

import java.util.LinkedList;

public class Editor {
    private LinkedList<DrawCommand> history = new LinkedList<>();

    public void execute(DrawCommand command) {
        history.push(command);
        command.execute();
    }

    public void undo() {
        if (history.isEmpty()) return;

        DrawCommand command = history.pop();
        if (command != null) {
            command.undo();
        }

    }
}