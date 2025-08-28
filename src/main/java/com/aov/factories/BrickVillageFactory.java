package com.aov.factories;

import com.aov.builders.*;
import com.aov.village.*;
import com.aov.colors.*;

/**
 * BrickVillageFactory - Concrete Factory Pattern implementation
 * Creates brick-style village components: Brick House + Mango Tree + Swimming Pool
 * Part of Abstract Factory Pattern - creates one family of related objects
 * Uses Bridge Pattern for colored shapes
 */
public class BrickVillageFactory extends AbstractVillageFactory {
    
    private HouseBuilder houseBuilder;
    private TreeBuilder treeBuilder;
    private WaterSourceBuilder waterSourceBuilder;
    
    public BrickVillageFactory() {
        this.houseBuilder = new HouseBuilder();
        this.treeBuilder = new TreeBuilder();
        this.waterSourceBuilder = new WaterSourceBuilder();
    }
    
    /**
     * Create a brick house using Builder pattern with colors
     * @return VillageComponent representing a brick house
     */
    @Override
    public VillageComponent createHouse() {
        // Brick house: white base + red roof
        return houseBuilder.buildTypicalHouse("Brick House", new White(), new Red());
    }
    
    /**
     * Create a mango tree using Builder pattern with colors
     * @return VillageComponent representing a mango tree
     */
    @Override
    public VillageComponent createTree() {
        // Mango tree: brown trunk + green crown
        return treeBuilder.buildTypicalTree("Mango Tree", new Brown(), new Green());
    }
    
    /**
     * Create a swimming pool using Builder pattern with colors
     * @return VillageComponent representing a swimming pool
     */
    @Override
    public VillageComponent createWaterSource() {
        // Swimming pool: blue water
        return waterSourceBuilder.buildRectangularWaterSource("Swimming Pool", new Blue());
    }
}
