package com.augustine.oop.calculator;

public class Operator {
    public final String operator;

    public Operator(String operator) {
        this.operator = operator;
    }
    public Operator() {
        this("+");
    }
    public boolean matches(String toCheckFor) {
        return this.operator.equals(toCheckFor);
    }
    public double operate(double operand1, double operand2) {
        return operand1 + operand2;
    }
}
