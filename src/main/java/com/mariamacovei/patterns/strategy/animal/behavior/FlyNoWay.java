package com.mariamacovei.patterns.strategy.animal.behavior;

import org.springframework.stereotype.Component;

@Component
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't fly");
	}
}
