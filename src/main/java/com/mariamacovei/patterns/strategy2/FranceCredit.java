package com.mariamacovei.patterns.strategy2;

public class FranceCredit implements CalculateFeeBehavior {
    private final int percent;

    public FranceCredit(int percent) {
        this.percent = percent;
    }

    @Override
    public double calculateFee(int balance) {
        System.out.println("France fee credit");
        return balance + (balance * percent / 100);
    }
}
