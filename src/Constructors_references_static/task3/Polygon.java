package Constructors_references_static.task3;


public class Polygon {
    Point[] puncte;
    int n;


//    public Polygon(int n)
//    {
//        Point[] puncte = new Point[n];
//        puncte[0] = new Point(2, 3);
//        puncte[1] = new Point(5, 4);
//        puncte[2] = new Point(6, 5);
//        for(int i=0;i<puncte.length;i++)
//        {
//            System.out.println("Punctul este:" + puncte[i]);
//        }

//    }

    public Polygon(int n) {
        this.n = n;
        this.puncte = new Point[n];
        for (int i = 0; i < puncte.length; i++) {
            puncte[i] = new Point(i, i);
            System.out.println("Puntul " + (i + 1) + " al poligonului este:");
            puncte[i].Afisare();

        }
    }

    public Polygon(Point[] N) {
        //Polygon z = new Polygon(N.length);
        this.puncte = N;
        this.n = N.length;


    }

    public void Afisare() {

    }


}

