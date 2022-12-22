package com.mariamacovei.patterns.strategy2;

public class MoldovaCredit implements CalculateFeeBehavior {
    private final int percent;

    public MoldovaCredit(int percent) {
        this.percent = percent;
    }

    @Override
    public double calculateFee(int balance) {
        System.out.println("Moldova fee credit");
        return balance + (balance * percent / 100);
    }
}
