package com.aov.colors;

/**
 * Blue color implementation - Concrete implementor in Bridge Pattern
 */
public class Blue implements Color {
    @Override
    public String getColorName() {
        return "Blue";
    }
    
    @Override
    public String getColorDescription() {
        return "blue";
    }
}
