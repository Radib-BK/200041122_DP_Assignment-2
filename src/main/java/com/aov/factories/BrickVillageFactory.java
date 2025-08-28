package com.aov.factories;

import com.aov.builders.*;
import com.aov.village.*;

/**
 * BrickVillageFactory - Concrete Factory Pattern implementation
 * Creates brick-style village components: Brick House + Mango Tree + Swimming Pool
 * Part of Abstract Factory Pattern - creates one family of related objects
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
     * Create a brick house using Builder pattern
     * @return VillageComponent representing a brick house
     */
    @Override
    public VillageComponent createHouse() {
        // Use builder to create brick house with rectangle + triangle
        return houseBuilder.buildTypicalHouse("Brick House");
    }
    
    /**
     * Create a mango tree using Builder pattern
     * @return VillageComponent representing a mango tree
     */
    @Override
    public VillageComponent createTree() {
        // Use builder to create mango tree with rectangle trunk + circle crown
        return treeBuilder.buildTypicalTree("Mango Tree");
    }
    
    /**
     * Create a swimming pool using Builder pattern
     * @return VillageComponent representing a swimming pool
     */
    @Override
    public VillageComponent createWaterSource() {
        // Use builder to create rectangular swimming pool
        return waterSourceBuilder.buildRectangularWaterSource("Swimming Pool");
    }
}
