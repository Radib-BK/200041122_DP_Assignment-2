package com.aov.shapes;

import com.aov.colors.Color;

/**
 * Triangle shape implementation
 * Concrete implementation of Shape interface
 * Bridge Pattern: Refined Abstraction that uses Color implementor
 */
public class Triangle implements Shape {
    private double base;
    private double height;
    private Color color;
    
    public Triangle(double base, double height, Color color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }
    
    @Override
    public String getDescription() {
        return "Triangle(base:" + base + ", height:" + height + ")";
    }
    
    @Override
    public String getType() {
        return "Triangle";
    }
    
    @Override
    public Color getColor() {
        return color;
    }
    
    @Override
    public String getColoredDescription() {
        return "A " + color.getColorDescription() + " triangle";
    }
    
    // Getters
    public double getBase() { return base; }
    public double getHeight() { return height; }
}
