package DesignPattern.StrageryPattern;

import DesignPattern.StrageryPattern.Stragery.Stragery;

public class Vehicle {

    Stragery objStragery;

    Vehicle(Stragery obStragery){
    this.objStragery = obStragery;
    }

    public void drive(){
        objStragery.drive();
    }
}
