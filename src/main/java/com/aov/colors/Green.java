package com.aov.colors;

/**
 * Green color implementation - Concrete implementor in Bridge Pattern
 */
public class Green implements Color {
    @Override
    public String getColorName() {
        return "Green";
    }
    
    @Override
    public String getColorDescription() {
        return "green";
    }
}
