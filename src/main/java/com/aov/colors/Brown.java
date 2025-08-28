package com.aov.colors;

/**
 * Brown color implementation - Concrete implementor in Bridge Pattern
 */
public class Brown implements Color {
    @Override
    public String getColorName() {
        return "Brown";
    }
    
    @Override
    public String getColorDescription() {
        return "brown";
    }
}
