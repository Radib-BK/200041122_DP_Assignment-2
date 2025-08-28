package com.aov.controllers;

import com.aov.factories.*;
import com.aov.village.*;

/**
 * VillageCreator - Controller class for village creation operations
 * Follows Single Responsibility Principle - handles only village creation logic
 * Separates business logic from Main class presentation logic
 */
public class VillageCreator {
    
    /**
     * Create a brick-style village using BrickVillageFactory (Abstract Factory Pattern)
     * @return Village object representing the created brick village
     */
    public static Village createBrickVillage() {
        System.out.println("Creating Brick Village...");
        System.out.println();
        
        // Abstract Factory Pattern: Use BrickVillageFactory to create family of objects
        AbstractVillageFactory factory = new BrickVillageFactory();
        
        // Create complete village using factory
        Village village = factory.createCompleteVillage("Brick Village");
        
        return village;
    }
    
    /**
     * Create a mud-style village using MudVillageFactory (Abstract Factory Pattern)
     * @return Village object representing the created mud village
     */
    public static Village createMudVillage() {
        System.out.println("Creating Mud Village...");
        System.out.println();
        
        // Abstract Factory Pattern: Use MudVillageFactory to create family of objects
        AbstractVillageFactory factory = new MudVillageFactory();
        
        // Create complete village using factory
        Village village = factory.createCompleteVillage("Mud Village");
        
        return village;
    }
    
    /**
     * Display the village and pattern information
     * @param village Village to display
     */
    public static void displayVillageWithPatternInfo(Village village) {
        // Composite Pattern: Display the village and all its components
        village.display();
        
        displayPatternInfo();
    }
    
    /**
     * Display information about the design patterns used
     */
    private static void displayPatternInfo() {
        System.out.println("=== Design Patterns Demonstrated ===");
        System.out.println("1. Composite Pattern: Village contains multiple VillageComponents");
        System.out.println("2. Builder Pattern: Components built from geometric shapes");
        System.out.println("3. Abstract Factory: Different factories create different families of objects");
        System.out.println("4. Bridge Pattern: Shapes separated from color implementations");
        System.out.println();
    }
}
