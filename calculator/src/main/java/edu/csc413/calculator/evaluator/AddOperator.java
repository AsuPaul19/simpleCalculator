package edu.csc413.calculator.evaluator;

import edu.csc413.calculator.operators.Operator;

public class AddOperator extends Operator {
    @Override
    public int priority(){
        return 1;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo)
    {
//        Operand sum = new Operand(operandOne.getValue() + operandTwo.getValue());
        int sum = operandOne.getValue() + operandTwo.getValue();
        Operand value = new Operand(sum);
        return value;
//        return sum;
    }
}
