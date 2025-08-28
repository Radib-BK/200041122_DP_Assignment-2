package com.aov.shapes;

/**
 * Rectangle shape implementation
 * Concrete implementation of Shape interface
 */
public class Rectangle implements Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String getDescription() {
        return "Rectangle(" + width + "x" + height + ")";
    }
    
    @Override
    public String getType() {
        return "Rectangle";
    }
    
    // Getters
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
