package edu.csc413.calculator.evaluator;

import edu.csc413.calculator.operators.Operator;

public class SubtractOperator extends Operator {
    @Override
    public int priority(){
        return 2;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo)
    {
        int subtract = operandOne.getValue() - operandTwo.getValue();
        Operand value = new Operand(subtract);
        return value;
    }

}
