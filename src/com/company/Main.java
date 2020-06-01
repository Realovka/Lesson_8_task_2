package com.company;

public class Main {

    public static void main(String[] args) {
        Spaceport spaceShuttle = new SpaceShuttle("Space Shuttle");
        Union union = new Union("Union");
        FalconHeavy falconHeavy = new FalconHeavy("Falcon Heavy");

        spaceShuttle.startRocket(spaceShuttle);
        System.out.println();
        union.startRocket(union);
        System.out.println();
        falconHeavy.startRocket(falconHeavy);

    }
}
