package com.company.lesson2;

public class MathFunc {
    private int operandIntFirst;
    private int operandIntSecond;
    private double operandDoubleFirst;
    private double operandDoubleSecond;
    private String operator;

    public MathFunc() {
        this.operandIntFirst = 0;
        this.operandIntSecond = 0;
        this.operandDoubleFirst = 0;
        this.operandDoubleSecond = 0;
        this.operator = null;
    }

    public MathFunc(String operator, int operand1, int operand2) {
        this.operator = operator;
        operandIntFirst = operand1;
        operandIntSecond = operand2;
    }

    public MathFunc(String operator, double operand1, double operand2) {
        this.operator = operator;
        operandDoubleFirst = operand1;
        operandDoubleSecond = operand2;
    }

    public int getOperandIntFirst() {
        return operandIntFirst;
    }

    public void setOperandIntFirst(int operandIntFirst) {
        this.operandIntFirst = operandIntFirst;
    }

    public int getOperandIntSecond() {
        return operandIntSecond;
    }

    public void setOperandIntSecond(int operandIntSecond) {
        this.operandIntSecond = operandIntSecond;
    }

    public double getOperandDoubleFirst() {
        return operandDoubleFirst;
    }

    public void setOperandDoubleFirst(double operandDoubleFirst) {
        this.operandDoubleFirst = operandDoubleFirst;
    }

    public double getOperandDoubleSecond() {
        return operandDoubleSecond;
    }

    public void setOperandDoubleSecond(double operandDoubleSecond) {
        this.operandDoubleSecond = operandDoubleSecond;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void mathOperation(String operator, int firstOperand, int secondOperand) {
        switch (operator) {
            case "div" -> operandIntFirst = firstOperand / secondOperand;
            case "log10" -> operandIntFirst = (int) Math.log10(firstOperand + secondOperand);
            case "log" -> operandIntFirst = (int) Math.log(firstOperand + secondOperand);
            case "pow" -> operandIntFirst = (int) Math.pow(firstOperand, secondOperand);
        }
    }

    public void mathOperation(String operator, double firstOperand, double secondOperand) {
        switch (operator) {
            case "div" -> operandDoubleFirst = firstOperand / secondOperand;
            case "log10" -> operandDoubleFirst = Math.log10(firstOperand + secondOperand);
            case "log" -> operandDoubleFirst = Math.log(firstOperand + secondOperand);
            case "pow" -> operandDoubleFirst = Math.pow(firstOperand, secondOperand);
        }
    }

}
