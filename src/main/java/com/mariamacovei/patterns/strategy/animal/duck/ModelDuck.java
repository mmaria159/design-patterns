package com.mariamacovei.patterns.strategy.animal.duck;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyNoWay;
import com.mariamacovei.patterns.strategy.animal.behavior.Quack;
import org.springframework.stereotype.Component;

@Component
public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
