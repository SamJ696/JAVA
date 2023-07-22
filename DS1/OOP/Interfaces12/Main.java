package com.DS1.OOP.Interfaces12;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.acc();
        car1.start();
        car1.brake();
        car1.stop();

        Media carMedia = new Car();
        carMedia.stop();



        NiceCar car = new NiceCar();

        car.start();
        car.stop();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
