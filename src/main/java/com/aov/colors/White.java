package com.aov.colors;

/**
 * White color implementation - Concrete implementor in Bridge Pattern
 */
public class White implements Color {
    @Override
    public String getColorName() {
        return "White";
    }
    
    @Override
    public String getColorDescription() {
        return "white";
    }
}
