package DesignPattern.DecoratorDesignPattern;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;
    Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return 15+basePizza.cost();
    }
    
}
