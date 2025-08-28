package com.aov.factories;

import com.aov.builders.*;
import com.aov.village.*;

/**
 * MudVillageFactory - Concrete Factory Pattern implementation
 * Creates mud-style village components: Mud House + Banana Tree + Pond
 * Part of Abstract Factory Pattern - creates another family of related objects
 */
public class MudVillageFactory extends AbstractVillageFactory {
    
    private HouseBuilder houseBuilder;
    private TreeBuilder treeBuilder;
    private WaterSourceBuilder waterSourceBuilder;
    
    public MudVillageFactory() {
        this.houseBuilder = new HouseBuilder();
        this.treeBuilder = new TreeBuilder();
        this.waterSourceBuilder = new WaterSourceBuilder();
    }
    
    /**
     * Create a mud house using Builder pattern
     * @return VillageComponent representing a mud house
     */
    @Override
    public VillageComponent createHouse() {
        // Use builder to create mud house with rectangle + triangle
        return houseBuilder.buildTypicalHouse("Mud House");
    }
    
    /**
     * Create a banana tree using Builder pattern
     * @return VillageComponent representing a banana tree
     */
    @Override
    public VillageComponent createTree() {
        // Use builder to create banana tree with rectangle trunk + circle crown
        return treeBuilder.buildTypicalTree("Banana Tree");
    }
    
    /**
     * Create a pond using Builder pattern
     * @return VillageComponent representing a pond
     */
    @Override
    public VillageComponent createWaterSource() {
        // Use builder to create circular pond
        return waterSourceBuilder.buildCircularWaterSource("Pond");
    }
}
