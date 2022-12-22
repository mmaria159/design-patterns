package com.mariamacovei.patterns.strategy.animal.duck;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyNoWay;
import com.mariamacovei.patterns.strategy.animal.behavior.MuteQuack;
import org.springframework.stereotype.Component;

@Component
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
