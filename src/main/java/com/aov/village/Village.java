package com.aov.village;

import java.util.List;
import java.util.ArrayList;

/**
 * Village class - Composite Pattern implementation
 * Acts as a composite that contains multiple VillageComponent objects
 * This is the composite in the Composite Pattern
 */
public class Village {
    private List<VillageComponent> components;
    private String villageName;
    
    public Village(String villageName) {
        this.villageName = villageName;
        this.components = new ArrayList<>();
    }
    
    /**
     * Add a component to the village (Composite Pattern operation)
     * @param component VillageComponent to add
     */
    public void addComponent(VillageComponent component) {
        components.add(component);
    }
    
    /**
     * Remove a component from the village (Composite Pattern operation)
     * @param component VillageComponent to remove
     */
    public void removeComponent(VillageComponent component) {
        components.remove(component);
    }
    
    /**
     * Display the entire village and all its components
     * Demonstrates Composite Pattern - calling operation on composite calls it on all children
     */
    public void display() {
        System.out.println("\n=== " + villageName + " ===");
        System.out.println("Village contains:");
        
        if (components.isEmpty()) {
            System.out.println("  No components in this village yet.");
        } else {
            for (VillageComponent component : components) {
                component.display();
            }
        }
        System.out.println();
    }
    
    /**
     * Get all components in the village
     * @return List of VillageComponent objects
     */
    public List<VillageComponent> getComponents() {
        return new ArrayList<>(components);
    }
    
    /**
     * Get village name
     * @return String village name
     */
    public String getVillageName() {
        return villageName;
    }
    
    /**
     * Get total number of components in village
     * @return int count of components
     */
    public int getComponentCount() {
        return components.size();
    }
}
