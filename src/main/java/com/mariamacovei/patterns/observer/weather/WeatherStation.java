package com.mariamacovei.patterns.observer.weather;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/weather")
@RequiredArgsConstructor
public class WeatherStation {
    private final WeatherData weatherData;
    @Autowired
    private final Map<String, Observer> observers = new HashMap<>();

    @GetMapping
    public void getWeather() {
        weatherData.setMeasurements(80, 65, 30.4f);
    }

    @DeleteMapping("/delete/{observer}")
    public void unsubscribe(@PathVariable String observer) {
        weatherData.removeObserver(observers.get(observer));
    }

    @GetMapping("/add/{observer}")
    public void subscribe(@PathVariable String observer) {
        weatherData.registerObserver(observers.get(observer));
    }
}
