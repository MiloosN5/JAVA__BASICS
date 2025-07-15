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
public class ClassExample {

    public static void run() {
        Bicycle bike = new Bicycle();
        bike.changeCadence(5);
        bike.printStates(); // cadence:5 speed:0 gear:1
        bike.speedUp(12);
        bike.printStates(); // cadence:5 speed:12 gear:1
        bike.speedUp(15);
        bike.printStates(); // cadence:5 speed:27 gear:1
    }
}
