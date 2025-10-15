package Aggregation_and_Inheritance;

public class Main {
    public static void main(String[] args) {

        Form form = new Form("visiniu");             ///task4+6
        Form[] forms = new Form[3];
        forms[0] = new Square();
        forms[1] = new Circle();
        forms[2] = new Triangle();
        for (int i = 0; i < forms.length; i++) {
            Form f = forms[i];
            System.out.println(i + 1 + ":" + f.toString());
        }
        for (Form f : forms) {
            System.out.println(f.toString());
        }

        Square s = new Square();
        Circle c = new Circle();
        Triangle t = new Triangle();

        System.out.println(c);
        System.out.println("Aria patratului este:" + s.getArea());

        System.out.println("" + t.equals(c));         ///task3

        for (int i = 0; i < forms.length; i++) {/// task 5 {
            if (forms[i] instanceof Square)
                s.printSquareDimensions();

            if (forms[i] instanceof Triangle)
                t.printTriangleDimensions();

            if (forms[i] instanceof Circle)
                c.printCircleDimensions();

        }

        s.printPerimeter(); ///task7

    }
}
