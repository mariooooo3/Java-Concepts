package Exceptions.task1;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class Test {
    MyCalculator calculator = new MyCalculator();

    @org.junit.jupiter.api.Test
    public void add1() throws Calculator.UnderFlowException,
            Calculator.NullParameterException,
            Calculator.OverFlowException {
        double sum = calculator.add(2.0, 3.0);
        assertEquals(5.0, sum);
    }

    @org.junit.jupiter.api.Test
    public void divide1() throws Calculator.NullParameterException {
        double div = calculator.divide(10.0, 2.5);
        assertEquals(4.0, div);
    }

    @org.junit.jupiter.api.Test
    public void avarage1() throws Calculator.NullParameterException,
            Calculator.UnderFlowException,
            Calculator.OverFlowException {
        List<Double> numbers;
        numbers = Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        double avarage = calculator.avarage(numbers);
        assertEquals(5.5, avarage);
    }

    @org.junit.jupiter.api.Test
    public void addOverFlow() {

        Calculator.OverFlowException exception = assertThrows(
                Calculator.OverFlowException.class,
                () -> calculator.add(Double.MAX_VALUE, Double.MAX_VALUE)
        );

        assertEquals("Sum overflow", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void addUnderFlow() {
        Calculator.UnderFlowException exception = assertThrows(
                Calculator.UnderFlowException.class,
                () -> calculator.add(-Double.MAX_VALUE, -Double.MAX_VALUE));
        assertEquals("Sum underflow", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void divideZero() {
        Calculator.NullParameterException exception = assertThrows(
                Calculator.NullParameterException.class,
                () -> calculator.divide(10.47, 0.0));
        assertEquals("Division by zero", exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void avarageEmpty() {
        List<Double> numbers;
        numbers = Arrays.asList();

        Calculator.NullParameterException exception = assertThrows(
                Calculator.NullParameterException.class,
                () -> calculator.avarage(numbers));
        assertEquals("Numbers is null or empty", exception.getMessage());
    }


}
