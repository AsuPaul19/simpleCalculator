package edu.csc413.calculator.evaluator;

import edu.csc413.calculator.operators.Operator;

public class rightParenthesisOperator extends Operator {
    @Override
    public int priority(){
        return 1;
    }
    @Override
    public Operand execute(Operand operandOne, Operand operandTwo){
        return operandOne;
    }
}
