package com.aov.builders;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.*;
import com.aov.village.*;

/**
 * HouseBuilder - Concrete Builder Pattern implementation for houses
 * Builds House objects from shapes
 */
public class HouseBuilder extends VillageComponentBuilder {
    
    /**
     * Build a house from the accumulated shapes
     * @param houseType Type of house to build (e.g., "Brick House", "Mud House")
     * @return House object built from shapes
     */
    @Override
    public VillageComponent build(String houseType) {
        if (shapes.isEmpty()) {
            throw new IllegalStateException("Cannot build house without shapes");
        }
        
        House house = new House(houseType, new ArrayList<>(shapes));
        reset(); // Clear shapes for next build
        return house;
    }
    
    /**
     * Convenience method to create a typical house structure
     * @param houseType Type of house
     * @return Built house component
     */
    public VillageComponent buildTypicalHouse(String houseType) {
        // Typical house: rectangle base + triangle roof
        addShape(new Rectangle(10.0, 8.0)) // House base
            .addShape(new Triangle(10.0, 4.0)); // Roof
        return build(houseType);
    }
}
