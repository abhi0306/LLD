package DesignPattern.StrageryPattern;

public class mainStrageryDesignPattern {
    public static void main(String[] args) {
        Vehicle v1 = new Sport();
        v1.drive();
        Vehicle v2 = new NormalDrive();
        v2.drive();
    }
}
