package Constructors_references_static.task3;


public class Point {
    float x1;
    float x2;

    public Point(float x1, float x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public void changeCoords(float a, float b) {
        this.x1 = a;
        this.x2 = b;
    }

    public void Afisare() {
        System.out.println("(" + x1 + ",  " + x2 + ")");
    }


}
