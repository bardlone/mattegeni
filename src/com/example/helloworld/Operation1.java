package com.example.helloworld;

public enum Operation1 {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE;

    public double operationResult(int n1, int n2) {
        switch (this) {
            case PLUS: {
                return (n1 + n2);
            }
            case MINUS: {
                return n1 - n2;
            }
            case MULTIPLY: {
                return n1 * n2;
            }
            case DIVIDE: {
                return n1 / n2;
            }
        }
        throw new IllegalArgumentException("Behavior for operation is not specified.");
    }

    public static Operation1 getOperationByCode(int code) {
        switch (code) {
            case 1:
                return PLUS;
            case 2:
                return MINUS;
            case 3:
                return MULTIPLY;
            case 4:
                return DIVIDE;
        }
        throw new IllegalArgumentException("Operation with this code not found.");
    }
}