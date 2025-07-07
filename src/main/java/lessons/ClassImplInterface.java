/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lessons;

import references.interfaces.Vehicle;

/**
 *
 * @author PC
 */
public class ClassImplInterface {

    static class Car implements Vehicle {

        int speed = 0;
        int gear = 1;

        @Override
        public void accelerate(int value) {
            speed += value;
        }

        @Override
        public void brake(int value) {
            speed -= value;
        }

        @Override
        public void changeGear(int g) {
            gear = g;
        }

        void status() {
            System.out.println("Speed: " + speed + ", Gear: " + gear);
        }
    }

    public static void run() {
        Car myCar = new Car();
        myCar.accelerate(20);
        myCar.changeGear(3);
        myCar.brake(5);
        myCar.status(); // Speed: 15, Gear: 3
    }
}
