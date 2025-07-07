/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessons;

import references.classes.Bicycle;

/**
 *
 * @author PC
 */
public class InheritanceExample extends ClassExample {

    static class MountainBike extends Bicycle {

        int suspensionLevel;

        public MountainBike(int startCadence, int startSpeed, int startGear, int suspension) {
            cadence = startCadence;
            speed = startSpeed;
            gear = startGear;
            suspensionLevel = suspension;
        }

        public void setSuspension(int level) {
            suspensionLevel = level;
        }

        public void printFullState() {
            printStates();
            System.out.println("suspension level: " + suspensionLevel);
        }

    }

    public static void run() {
        MountainBike myBike = new MountainBike(10, 0, 1, 5);
        myBike.changeGear(2);
        myBike.speedUp(20);
        myBike.changeCadence(90);
        myBike.setSuspension(7);
        myBike.printFullState();
        /*
            cadence:90 speed:20 gear:2
            suspension level: 7
         */
    }
}