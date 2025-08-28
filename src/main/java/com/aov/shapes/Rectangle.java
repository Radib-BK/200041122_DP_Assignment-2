package com.aov.shapes;

import com.aov.colors.Color;

/**
 * Rectangle shape implementation
 * Concrete implementation of Shape interface
 * Bridge Pattern: Refined Abstraction that uses Color implementor
 */
public class Rectangle implements Shape {
    private double width;
    private double height;
    private Color color;
    
    public Rectangle(double width, double height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    @Override
    public String getDescription() {
        return "Rectangle(" + width + "x" + height + ")";
    }
    
    @Override
    public String getType() {
        return "Rectangle";
    }
    
    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public String getColoredDescription() {
        return "A " + color.getColorDescription() + " rectangle";
    }
    
    // Getters
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}
