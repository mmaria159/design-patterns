package com.mariamacovei.patterns.strategy.challenge.cameraapp;

import com.mariamacovei.patterns.strategy.challenge.sharestrategy.ShareStrategy;

public abstract class PhoneCameraApp {
    protected ShareStrategy shareStrategy;

    public void setShareStrategy(ShareStrategy shareStrategy) {
        this.shareStrategy = shareStrategy;
    }

    public void share() {
        shareStrategy.share();
    }

    public void take() {
        System.out.println("Taking the photo");
    }

    public void save() {
        System.out.println("Saving the photo");
    }

    public abstract void edit();
}
