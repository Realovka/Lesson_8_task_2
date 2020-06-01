package com.company;

public abstract class Spaceport {

    private String rocket;

    public Spaceport(String rocket) {
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

    public void startRocket(Spaceport a){
        boolean result = preLaunchCheck();
        if (result) {
            startEngine();
            for (int i=9; i>=0; i--){
                System.out.println(i);
            }
            start();

        } else {
            System.out.println("Предстартовая проверка "+rocket+" не пройдена");
        }
    }
}
