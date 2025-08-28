package com.aov.shapes;

/**
 * Circle shape implementation
 * Concrete implementation of Shape interface
 */
public class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String getDescription() {
        return "Circle(radius:" + radius + ")";
    }
    
    @Override
    public String getType() {
        return "Circle";
    }
    
    // Getter
    public double getRadius() { return radius; }
}
