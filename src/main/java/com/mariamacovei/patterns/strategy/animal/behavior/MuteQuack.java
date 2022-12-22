package com.mariamacovei.patterns.strategy.animal.behavior;

import org.springframework.stereotype.Component;

@Component
public class MuteQuack implements QuackBehavior {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}
