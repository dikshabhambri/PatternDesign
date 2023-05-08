package com.example.designpattern.AbstractFactoryPattern;

import com.example.designpattern.FactoryPattern.Rectangle;
import com.example.designpattern.FactoryPattern.Shape;
import com.example.designpattern.FactoryPattern.Square;

public class ShapeFactory2 extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
