package Abstraction.task2;


public class Operation implements Minus, Plus, Mult, Div {
    float number;

    public Operation(float value) {
        this.number = value;
    }

    public float getNumber() {
        return number;
    }

    @Override
    public void plus(float value) {
        number = number + value;
    }

    @Override
    public void minus(float value) {
        number = number - value;
    }

    @Override
    public void mult(float value) {
        number = number * value;
    }

    @Override
    public void div(float value) {
        if (value == 0)
            System.out.println("Nu se poate face impartirea :(");

        number = number / value;
    }

}
