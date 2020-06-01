package com.company;

public class Main {

    public static void main(String[] args) {
        SpaceShuttle spaceShuttle = new SpaceShuttle("Space Shuttle");
        Rocket union = new Union("Union");
        Rocket falconHeavy = new FalconHeavy("Falcon Heavy");

        Spaceport spaceport1 = new Spaceport(spaceShuttle);
        Spaceport spaceport2 = new Spaceport(union);
        Spaceport spaceport3 = new Spaceport(falconHeavy);

        spaceport1.startRocket(spaceShuttle);
        spaceport2.startRocket(union);
        spaceport3.startRocket(falconHeavy);


    }
}
