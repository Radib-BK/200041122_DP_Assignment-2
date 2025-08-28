package com.aov.ui;

import java.util.Scanner;
import com.aov.controllers.VillageCreator;
import com.aov.village.Village;

/**
 * CLIHandler - Handles Command Line Interface operations
 * Follows Single Responsibility Principle - handles only UI/presentation logic
 * Separates presentation logic from business logic
 */
public class CLIHandler {
    
    private Scanner scanner;
    
    public CLIHandler() {
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Start the CLI application
     */
    public void start() {
        System.out.println("=== Welcome to Age of Villagers - Village Creator ===");
        System.out.println();
        
        while (true) {
            displayMenu();
            
            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    handleBrickVillageCreation();
                    break;
                case "2":
                    handleMudVillageCreation();
                    break;
                case "3":
                    handleExit();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    System.out.println();
            }
            
            waitForUserInput();
        }
    }
    
    /**
     * Display the main menu options
     */
    private void displayMenu() {
        System.out.println("Choose your village type:");
        System.out.println();
        System.out.println("1. Brick House + Mango Tree + Swimming Pool");
        System.out.println("2. Mud House + Banana Tree + Pond");
        System.out.println("3. Exit");
        System.out.println();
    }
    
    /**
     * Handle brick village creation request
     */
    private void handleBrickVillageCreation() {
        Village village = VillageCreator.createBrickVillage();
        VillageCreator.displayVillageWithPatternInfo(village);
    }
    
    /**
     * Handle mud village creation request
     */
    private void handleMudVillageCreation() {
        Village village = VillageCreator.createMudVillage();
        VillageCreator.displayVillageWithPatternInfo(village);
    }
    
    /**
     * Handle exit request
     */
    private void handleExit() {
        System.out.println("Thank you for playing Age of Villagers! Goodbye!");
        scanner.close();
    }
    
    /**
     * Wait for user input before continuing
     */
    private void waitForUserInput() {
        try {
            System.out.println("Press Enter to continue...");
            scanner.nextLine();
        } catch (Exception e) {
            // Handle case where input stream is closed or no more input
            return;
        }
        System.out.println();
    }
}
