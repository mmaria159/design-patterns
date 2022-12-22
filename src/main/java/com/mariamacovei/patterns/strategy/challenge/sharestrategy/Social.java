package com.mariamacovei.patterns.strategy.challenge.sharestrategy;

import org.springframework.stereotype.Component;

@Component
public class Social implements ShareStrategy {
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
