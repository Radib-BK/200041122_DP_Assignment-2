package com.aov.builders;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.*;
import com.aov.village.*;

/**
 * WaterSourceBuilder - Concrete Builder Pattern implementation for water sources
 * Builds WaterSource objects from shapes
 */
public class WaterSourceBuilder extends VillageComponentBuilder {
    
    /**
     * Build a water source from the accumulated shapes
     * @param waterSourceType Type of water source to build (e.g., "Swimming Pool", "Pond")
     * @return WaterSource object built from shapes
     */
    @Override
    public VillageComponent build(String waterSourceType) {
        if (shapes.isEmpty()) {
            throw new IllegalStateException("Cannot build water source without shapes");
        }
        
        WaterSource waterSource = new WaterSource(waterSourceType, new ArrayList<>(shapes));
        reset(); // Clear shapes for next build
        return waterSource;
    }
    
    /**
     * Convenience method to create a circular water source (pond)
     * @param waterSourceType Type of water source
     * @return Built water source component
     */
    public VillageComponent buildCircularWaterSource(String waterSourceType) {
        // Circular water source: just a circle
        addShape(new Circle(5.0)); // Water body
        return build(waterSourceType);
    }
    
    /**
     * Convenience method to create a rectangular water source (swimming pool)
     * @param waterSourceType Type of water source
     * @return Built water source component
     */
    public VillageComponent buildRectangularWaterSource(String waterSourceType) {
        // Rectangular water source: rectangle
        addShape(new Rectangle(12.0, 6.0)); // Pool
        return build(waterSourceType);
    }
}
