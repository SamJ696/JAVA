package com.DS1.OOP.Interfaces12;

public class NiceCar {
    private Engine engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    void start(){
        engine.start();
    }

    void stop (){
        engine.stop();
    }

    void startMusic(){
        player.start();
    }

    void stopMusic(){
        player.stop();
    }

    void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
