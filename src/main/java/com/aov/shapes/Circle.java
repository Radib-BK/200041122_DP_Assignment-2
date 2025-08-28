package com.aov.shapes;

import com.aov.colors.Color;

/**
 * Circle shape implementation
 * Concrete implementation of Shape interface
 * Bridge Pattern: Refined Abstraction that uses Color implementor
 */
public class Circle implements Shape {
    private double radius;
    private Color color;
    
    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public String getDescription() {
        return "Circle(radius:" + radius + ")";
    }
    
    @Override
    public String getType() {
        return "Circle";
    }
    
    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public String getColoredDescription() {
        return "A " + color.getColorDescription() + " circle";
    }
    
    // Getter
    public double getRadius() { return radius; }
}
