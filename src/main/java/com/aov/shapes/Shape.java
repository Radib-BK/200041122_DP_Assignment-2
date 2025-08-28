package com.aov.shapes;

/**
 * Shape interface - Base interface for all geometric shapes
 * Used in Builder pattern to construct village components
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
}
