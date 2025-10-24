package Constructors_references_static.task3;


public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2, 4);
        Point p2 = new Point(5, 3);

        p1.Afisare();
        ;
        p1.changeCoords(7, 9);
        p1.Afisare();
        p2.Afisare();

        Polygon z = new Polygon(2);
        Point[] points = {new Point(8, 8), new Point(9, 9)};
        Polygon p = new Polygon(points); // square


    }


}
