package com.aov.village;

import java.util.List;
import com.aov.shapes.Shape;

/**
 * VillageComponent interface - Part of Composite Pattern
 * Common interface for all village components (houses, trees, water sources)
 */
public interface VillageComponent {
    /**
     * Display the component information
     */
    void display();
    
    /**
     * Get the type of the component
     * @return String representing component type
     */
    String getComponentType();
    
    /**
     * Get the shapes that make up this component
     * @return List of shapes used to build this component
     */
    List<Shape> getShapes();
}
