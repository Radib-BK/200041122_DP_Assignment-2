package com.aov.colors;

/**
 * Red color implementation - Concrete implementor in Bridge Pattern
 */
public class Red implements Color {
    @Override
    public String getColorName() {
        return "Red";
    }
    
    @Override
    public String getColorDescription() {
        return "red";
    }
}
