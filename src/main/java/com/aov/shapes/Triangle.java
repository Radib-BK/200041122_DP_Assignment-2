package com.aov.shapes;

/**
 * Triangle shape implementation
 * Concrete implementation of Shape interface
 */
public class Triangle implements Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public String getDescription() {
        return "Triangle(base:" + base + ", height:" + height + ")";
    }
    
    @Override
    public String getType() {
        return "Triangle";
    }
    
    // Getters
    public double getBase() { return base; }
    public double getHeight() { return height; }
}
