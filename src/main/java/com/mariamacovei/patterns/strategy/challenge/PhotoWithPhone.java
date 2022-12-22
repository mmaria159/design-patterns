package com.mariamacovei.patterns.strategy.challenge;

import com.mariamacovei.patterns.strategy.challenge.cameraapp.PhoneCameraApp;
import com.mariamacovei.patterns.strategy.challenge.sharestrategy.ShareStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/photo")
public class PhotoWithPhone {
    @Autowired
    private final Map<String, PhoneCameraApp> cameras = new HashMap<>();
    @Autowired
    private final Map<String, ShareStrategy> strategies = new HashMap<>();

    @GetMapping
    public String share(@RequestParam Map<String, String> parameters) {
        PhoneCameraApp phoneCameraApp = cameras.get(parameters.get("camera"));
        phoneCameraApp.setShareStrategy(strategies.get(parameters.get("strategy")));
        phoneCameraApp.take();
        phoneCameraApp.edit();
        phoneCameraApp.save();
        phoneCameraApp.share();
        return "";
    }
// cameras = [ basicCameraApp, cameraPlusApp ]
// strategies = [ txt, email, social, facebook ]
}
