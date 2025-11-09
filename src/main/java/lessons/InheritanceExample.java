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
public class InheritanceExample {

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
        // [1] Using child class reference: all MountainBike methods are accessible
        MountainBike myBike1 = new MountainBike(10, 0, 1, 5);
        myBike1.changeGear(2);
        myBike1.speedUp(20);
        myBike1.changeCadence(90);
        myBike1.setSuspension(7);
        myBike1.printFullState();
        /*
            cadence:90 speed:20 gear:2
            suspension level: 7
        */
        
        // [2] Using parent class reference: only Bicycle methods are accessible directly
        Bicycle myBike2 = new MountainBike(10, 0, 1, 5);
        myBike2.changeGear(2);
        myBike2.speedUp(20);
        myBike2.changeCadence(90);
        // myBike2.setSuspension(7); // variable myBike2 of type references.classes.Bicycle
        // myBike2.printFullState(); // variable myBike2 of type references.classes.Bicycle
    
        // to use methods specific to "MountainBike", we need to cast the reference
        if (myBike2 instanceof MountainBike) {
            MountainBike mtb = (MountainBike) myBike2;
            mtb.setSuspension(7);
            mtb.printFullState(); 
        }
        /*
            cadence:90 speed:20 gear:2
            suspension level: 7
        */       
    
    }
}
