package DesignPattern.DecoratorDesignPattern;

public class mainDecorator {
    public static void main(String[] args) {
        BasePizza p1 = new ExtraCheese(new ExtraCheese(new FarmHouse()));
        System.out.println(p1.cost());
    }
}
