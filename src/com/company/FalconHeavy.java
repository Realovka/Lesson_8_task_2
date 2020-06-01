package com.company;

import java.util.Scanner;

public class FalconHeavy extends Rocket {

    public FalconHeavy(String rocket) {
        super(rocket);
    }

    @Override
    public boolean preLaunchCheck() {
        boolean result=true;
        System.out.println("Введите число");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        if (x>10){
            result=false;
        }
        return result;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск 4 двигателей "+getRocket());
    }

    @Override
    public void start() {
        System.out.println("Ракета пошла...");
    }
}
