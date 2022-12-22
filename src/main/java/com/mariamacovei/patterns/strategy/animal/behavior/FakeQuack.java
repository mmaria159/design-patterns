package com.mariamacovei.patterns.strategy.animal.behavior;

import org.springframework.stereotype.Component;

@Component
public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
