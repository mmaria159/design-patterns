package com.mariamacovei.patterns.strategy.challenge.sharestrategy;

import org.springframework.stereotype.Component;

@Component
public class Txt implements ShareStrategy {
	public void share() {
		System.out.println("I'm txting the photo");
	}
}
