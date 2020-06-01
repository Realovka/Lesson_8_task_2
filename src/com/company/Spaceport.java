package com.company;


public class Spaceport {

    private Rocket rocket;

    public Spaceport(Rocket rocket) {
        this.rocket = rocket;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public void startRocket(Rocket rocket){
        boolean result = rocket.preLaunchCheck();
        if (result) {
            rocket.startEngine();
            for (int i=9; i>=0; i--){
                System.out.println(i);
            }
            rocket.start();

        } else {
            System.out.println("Предстартовая проверка "+rocket.getRocket()+" не пройдена");
        }
    }
}
