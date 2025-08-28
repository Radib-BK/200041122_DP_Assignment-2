package com.aov.factories;

import com.aov.village.*;

/**
 * AbstractVillageFactory - Abstract Factory Pattern implementation
 * Defines the interface for creating families of related village objects
 */
public abstract class AbstractVillageFactory {
    
    /**
     * Create a house using the factory's specific style
     * @return VillageComponent representing a house
     */
    public abstract VillageComponent createHouse();
    
    /**
     * Create a tree using the factory's specific style
     * @return VillageComponent representing a tree
     */
    public abstract VillageComponent createTree();
    
    /**
     * Create a water source using the factory's specific style
     * @return VillageComponent representing a water source
     */
    public abstract VillageComponent createWaterSource();
    
    /**
     * Create a complete village with all components
     * @param villageName Name for the village
     * @return Village object with all components added
     */
    public Village createCompleteVillage(String villageName) {
        Village village = new Village(villageName);
        village.addComponent(createHouse());
        village.addComponent(createTree());
        village.addComponent(createWaterSource());
        return village;
    }
}
