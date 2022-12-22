package com.mariamacovei.patterns.strategy.challenge.cameraapp;

import org.springframework.stereotype.Component;

@Component
public class CameraPlusApp extends PhoneCameraApp {
    public void edit() {
        System.out.println("Extra snazzy photo editing features");
    }
}
