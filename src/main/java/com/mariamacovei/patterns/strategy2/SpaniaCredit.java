package com.mariamacovei.patterns.strategy2;

public class SpaniaCredit implements CalculateFeeBehavior {
    private final int percent;

    public SpaniaCredit(int percent) {
        this.percent = percent;
    }

    @Override
    public double calculateFee(int balance) {
        System.out.println("Spania fee credit");
        return balance + (balance * percent / 100);
    }
}
