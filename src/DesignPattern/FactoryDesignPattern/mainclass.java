package DesignPattern.FactoryDesignPattern;

public class mainclass {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
    Shape shape = shapeFactory.getShape("Circle");
    shape.draw();
    }
    
}
