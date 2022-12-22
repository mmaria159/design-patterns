package com.mariamacovei.patterns.strategy.animal.duck;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyWithWings;
import com.mariamacovei.patterns.strategy.animal.behavior.Quack;
import org.springframework.stereotype.Component;

@Component
public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
