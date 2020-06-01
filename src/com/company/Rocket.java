package com.company;

public abstract class Rocket {

    private String rocket;

    public Rocket(String rocket) {
        this.rocket = rocket;
    }

    public String getRocket() {
        return rocket;
    }

    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public abstract boolean preLaunchCheck();

    public abstract void startEngine();

    public abstract void start();


}
