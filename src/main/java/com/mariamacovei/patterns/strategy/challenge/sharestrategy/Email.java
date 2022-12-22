package com.mariamacovei.patterns.strategy.challenge.sharestrategy;

import org.springframework.stereotype.Component;

@Component
public class Email implements ShareStrategy {
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}
