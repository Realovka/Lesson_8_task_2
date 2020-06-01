package com.company;

import java.util.Random;

public class SpaceShuttle extends Rocket {

    public SpaceShuttle(String rocket) {
        super(rocket);
    }


    @Override
    public boolean preLaunchCheck() {
        boolean result =true;
        Random random = new Random();
        int x = random.nextInt(10);
        if (x > 3){
           result=false;
        }
            return result;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск трех двигателей "+getRocket());
    }

    @Override
    public void start() {
        System.out.println("Старт ракеты");
    }
}
