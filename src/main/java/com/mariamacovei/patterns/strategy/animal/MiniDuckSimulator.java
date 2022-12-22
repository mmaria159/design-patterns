package com.mariamacovei.patterns.strategy.animal;

import com.mariamacovei.patterns.strategy.animal.behavior.FlyBehavior;
import com.mariamacovei.patterns.strategy.animal.behavior.QuackBehavior;
import com.mariamacovei.patterns.strategy.animal.duck.Duck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/duck")
public class MiniDuckSimulator {
    @Autowired
    private final Map<String, Duck> ducks = new HashMap<>();
    @Autowired
    private final Map<String, FlyBehavior> flyBehavior = new HashMap<>();
    @Autowired
    private final Map<String, QuackBehavior> quackBehavior = new HashMap<>();

    @GetMapping
    public void fly(@RequestParam Map<String, String> params) {
        Duck duck = ducks.get(params.get("duck"));
        duck.setQuackBehavior(quackBehavior.get(params.get("quack")));
        duck.setFlyBehavior(flyBehavior.get(params.get("fly")));
        duck.performQuack();
        duck.performFly();
    }

//     decoyDuck  mallardDuck   modelDuck   redHeadDuck   rubberDuck
}
