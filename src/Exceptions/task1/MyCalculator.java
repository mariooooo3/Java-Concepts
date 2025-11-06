package Exceptions.task1;

import java.util.Collection;

public class MyCalculator implements CalculatorBase, Calculator {
    double sum;

    public double add(double a, double b)
            throws Calculator.NullParameterException,
            OverFlowException, UnderFlowException {

        sum = a + b;

        if (sum == Double.POSITIVE_INFINITY)
            throw new OverFlowException("Sum overflow");
        if (sum == Double.NEGATIVE_INFINITY)
            throw new UnderFlowException("Sum underflow");

        return sum;
    }

    public double divide(double a, double b)
            throws Calculator.NullParameterException {
        if (b == 0)
            throw new NullParameterException("Division by zero");
        return a / b;
    }

    public double avarage(Collection<Double> numbers)
            throws NullParameterException,
            UnderFlowException,
            OverFlowException {
        if (numbers == null || numbers.isEmpty())
            throw new NullParameterException("Numbers is null or empty");
        double sum = 0;
        for (Double number : numbers) {
            sum = add(sum, number);
        }
        return divide(sum, numbers.size());
    }

}
