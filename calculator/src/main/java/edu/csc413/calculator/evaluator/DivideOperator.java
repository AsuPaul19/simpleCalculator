package edu.csc413.calculator.evaluator;

import edu.csc413.calculator.operators.Operator;

public class DivideOperator extends Operator {
    @Override
    public int priority(){
        return 3;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo)
    {
        int divide = operandOne.getValue()/operandTwo.getValue();
        Operand value = new Operand(divide);
        return value;
    }

}
