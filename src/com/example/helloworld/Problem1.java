package com.example.helloworld;

import java.util.Random;

public class Problem1 {
    private static final int DEFAULT_MIN_VALUE = 1;
    private static final int DEFAULT_MAX_VALUE = 10;

    private int number1;
    private int number2;
    private Operation1 operation;

    private Problem1(){
    }

    public static Problem1 generateRandomProblem(){
        return generateRandomProblem(DEFAULT_MIN_VALUE, DEFAULT_MAX_VALUE);
    }

    public static Problem1 generateRandomProblem(int minValue, int maxValue){
        Problem1 prob = new Problem1();
        Random randomGen = new Random();

        int number1 = randomGen.nextInt(maxValue + minValue) + minValue;
        int number2 = randomGen.nextInt(maxValue + minValue) + minValue;

        prob.setNumber1(number1);
        prob.setNumber2(number2);

        int operationCode = randomGen.nextInt(4);
        Operation1 operation = Operation1.getOperationByCode(operationCode);
        prob.setOperation(operation);

        return prob;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public Operation1 getOperation() {
        return operation;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(Operation1 operation) {
        this.operation = operation;
    }
}