package com.mariamacovei.patterns.strategy.animal.behavior;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyBehavior;
import org.springframework.stereotype.Component;

@Component
public class FlyRocketPowered implements FlyBehavior {
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
