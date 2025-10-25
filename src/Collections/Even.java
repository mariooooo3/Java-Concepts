package Collections;

public abstract class Even {
    public void add(Integer x) {
        if (x % 2 != 0)
            System.out.println("Numarul " + x + " NU este par si NU poate fi adaugat");
        else
            addEven(x);
    }

    public abstract void addEven(Integer x);

    public String toString() {
        return "";
    }
}
