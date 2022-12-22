package com.mariamacovei.patterns.strategy.animal.duck;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyBehavior;
import com.mariamacovei.patterns.strategy.animal.behavior.FlyNoWay;
import com.mariamacovei.patterns.strategy.animal.behavior.QuackBehavior;
import org.springframework.stereotype.Component;

@Component
public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		//quackBehavior = new Squeak();
		quackBehavior = () -> System.out.println("Squeak");
	}
	
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior; 
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
