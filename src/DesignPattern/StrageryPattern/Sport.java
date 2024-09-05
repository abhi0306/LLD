package DesignPattern.StrageryPattern;

import DesignPattern.StrageryPattern.Stragery.SportDrive;

public class Sport extends Vehicle{

    Sport() {
       super(new SportDrive());
    }
}
