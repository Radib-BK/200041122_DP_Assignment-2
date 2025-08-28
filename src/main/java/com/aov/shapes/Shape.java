package com.aov.shapes;

import com.aov.colors.Color;

/**
 * Shape interface - Base interface for all geometric shapes
 * Used in Builder pattern to construct village components
 * Bridge Pattern: Abstraction that uses Color implementor
 */
public interface Shape {
    /**
     * Returns a string representation of the shape
     * @return String description of the shape
     */
    String getDescription();
    
    /**
     * Returns the type of the shape
     * @return String type identifier
     */
    String getType();
    
    /**
     * Returns the color of the shape
     * @return Color object representing the shape's color
     */
    Color getColor();
    
    /**
     * Returns a colored description of the shape
     * @return String description with color
     */
    String getColoredDescription();
}
