package com.aov.builders;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.Shape;
import com.aov.village.VillageComponent;

/**
 * VillageComponentBuilder - Abstract Builder Pattern implementation
 * Defines the interface for building village components from shapes
 */
public abstract class VillageComponentBuilder {
    protected List<Shape> shapes;
    
    public VillageComponentBuilder() {
        this.shapes = new ArrayList<>();
    }
    
    /**
     * Add a shape to the component being built
     * @param shape Shape to add
     * @return Builder instance for method chaining
     */
    public VillageComponentBuilder addShape(Shape shape) {
        shapes.add(shape);
        return this;
    }
    
    /**
     * Reset the builder to start building a new component
     */
    public void reset() {
        shapes.clear();
    }
    
    /**
     * Abstract method to build the specific village component
     * Must be implemented by concrete builders
     * @param componentType String identifier for the component type
     * @return VillageComponent built from the shapes
     */
    public abstract VillageComponent build(String componentType);
}
