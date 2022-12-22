package com.mariamacovei.patterns.strategy2;

public class Credit {
    private final int balance;
    private CalculateFeeBehavior calculateFeeBehavior;

    public void setCalculateFeeBehavior(CalculateFeeBehavior calculateFeeBehavior) {
        this.calculateFeeBehavior = calculateFeeBehavior;
    }

    public Credit(int balance) {
        this.balance = balance;
    }

    public double calculateFee() {
        return calculateFeeBehavior.calculateFee(balance);
    }
}
