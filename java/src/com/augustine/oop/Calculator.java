package com.augustine.oop;

public class Calculator {
    private final double operand1;
    private final double operand2;
    private final String operator;

    public Calculator(double operand1, double operand2, String operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double operate() {
        switch (this.operator) {
            case "+":
                return (this.operand1 + this.operand2);
            case "-":
                return (this.operand1 - this.operand2);
            case "x":
                return (this.operand1 * this.operand2);
            case "/":
                return (this.operand1 / this.operand2);
            default:
                System.out.println("Can't find operator: " + this.operator);
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + new Calculator(2, 3, "+").operate());
        System.out.println("5 x 6 = " + new Calculator(5, 6, "x").operate());
        System.out.println("12 / 4 = " + new Calculator(12, 4, "/").operate());
        System.out.println("12 - 3 = " + new Calculator(12, 3, "-").operate());
        System.out.println("2 ** 3 = " + new Calculator(2, 3, "**").operate());
    }
}
