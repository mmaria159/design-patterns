package com.mariamacovei.patterns.strategy.challenge.cameraapp;

import org.springframework.stereotype.Component;

@Component
public class BasicCameraApp extends PhoneCameraApp {
    public void edit() {
        System.out.println("Basic editing features");
    }
}
