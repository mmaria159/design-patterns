package com.mariamacovei.patterns.strategy2;

public class Main {
    public static void main(String[] args) {
        Credit credit = new Credit(1000);
        CalculateFeeBehavior[] countries = {new MoldovaCredit(12), new FranceCredit(5), new SpaniaCredit(3)};
        for (CalculateFeeBehavior calculateFeeBehavior : countries) {
            credit.setCalculateFeeBehavior(calculateFeeBehavior);
            System.out.println(credit.calculateFee());
        }
    }
}
