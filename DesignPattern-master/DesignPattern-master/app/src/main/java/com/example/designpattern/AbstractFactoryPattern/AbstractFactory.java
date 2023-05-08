package com.example.designpattern.AbstractFactoryPattern;

import com.example.designpattern.FactoryPattern.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}
