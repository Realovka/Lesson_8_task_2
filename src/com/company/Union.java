package com.company;

import java.util.Scanner;

public class Union extends Spaceport {

    public Union(String rocket) {
        super(rocket);
    }

    @Override
    public boolean preLaunchCheck() {
        boolean result = true;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            result=false;
        }
        return result;
    }

    @Override
    public void startEngine() {
        System.out.println("Запуск двух двигателей "+getRocket());
    }

    @Override
    public void start() {
        System.out.println("Запуск устройства");
    }
}

