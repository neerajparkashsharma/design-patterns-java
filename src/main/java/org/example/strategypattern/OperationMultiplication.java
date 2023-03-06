package org.example.strategypattern;

public class OperationMultiplication implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
