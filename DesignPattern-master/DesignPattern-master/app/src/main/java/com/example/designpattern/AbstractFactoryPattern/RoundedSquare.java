package com.example.designpattern.AbstractFactoryPattern;

import com.example.designpattern.FactoryPattern.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
