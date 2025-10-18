package Design_patterns.Command_Pattern;

public class DiagramComponent {
    String color;
    String text;
    int length;
    int width;

    public DiagramComponent(String color, String text, int length, int width) {
        this.color = color;
        this.text = text;
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return " are culoarea " + color + " cu textul "
                + text + " lungimea " + length + " si latimea " + width + "\n";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }


}
