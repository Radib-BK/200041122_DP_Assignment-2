package com.aov.factories;

import com.aov.builders.*;
import com.aov.village.*;
import com.aov.colors.*;

/**
 * MudVillageFactory - Concrete Factory Pattern implementation
 * Creates mud-style village components: Mud House + Banana Tree + Pond
 * Part of Abstract Factory Pattern - creates another family of related objects
 * Uses Bridge Pattern for colored shapes
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
     * Create a mud house using Builder pattern with colors
     * @return VillageComponent representing a mud house
     */
    @Override
    public VillageComponent createHouse() {
        // Mud house: brown base + brown roof
        return houseBuilder.buildTypicalHouse("Mud House", new Brown(), new Brown());
    }
    
    /**
     * Create a banana tree using Builder pattern with colors
     * @return VillageComponent representing a banana tree
     */
    @Override
    public VillageComponent createTree() {
        // Banana tree: green trunk + green crown (all green like a banana plant)
        return treeBuilder.buildTypicalTree("Banana Tree", new Green(), new Green());
    }
    
    /**
     * Create a pond using Builder pattern with colors
     * @return VillageComponent representing a pond
     */
    @Override
    public VillageComponent createWaterSource() {
        // Pond: green rectangular water (more natural pond shape)
        return waterSourceBuilder.buildRectangularWaterSource("Pond", new Green());
    }
}
