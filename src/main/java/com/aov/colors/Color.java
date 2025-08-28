package com.aov.colors;

/**
 * Color interface - Bridge Pattern implementation
 * Defines the interface for color implementations
 */
public interface Color {
    /**
     * Get the color name
     * @return String representing the color
     */
    String getColorName();
    
    /**
     * Get color description for display
     * @return String description of the color
     */
    String getColorDescription();
}
