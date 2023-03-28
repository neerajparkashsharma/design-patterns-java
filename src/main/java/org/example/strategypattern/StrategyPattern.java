package org.example.strategypattern;

public class StrategyPattern {
    public static void main(String[] args) {

        Context context = new Context(new OperationAddition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiplication());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

//        context = new Context(new OperationMultiplication());
//        System.out.println("10 * 1 = " + context.executeStrategy(10, 1));
    }

}
