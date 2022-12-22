package com.mariamacovei.patterns.strategy.animal.duck;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyWithWings;
import com.mariamacovei.patterns.strategy.animal.behavior.Quack;
import org.springframework.stereotype.Component;

@Component
public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();

	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
