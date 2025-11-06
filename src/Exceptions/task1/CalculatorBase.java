package Exceptions.task1;

import java.util.Collection;

public interface CalculatorBase {

    public double add(double x, double y) throws Calculator.NullParameterException,
            Calculator.OverFlowException,
            Calculator.UnderFlowException;

    public double divide(double x, double y) throws Calculator.NullParameterException;

    public double avarage(Collection<Double> numbers) throws Calculator.NullParameterException,
            Calculator.UnderFlowException,
            Calculator.OverFlowException;
}
