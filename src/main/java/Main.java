import java.util.Scanner;
import com.aov.factories.*;
import com.aov.village.*;

/**
 * Main class - Entry point for Age of Villagers CLI application
 * Demonstrates the integration of Composite, Builder, and Abstract Factory patterns
 * 
 * Running instructions:
 * javac -d build/classes -sourcepath src/main/java src/main/java/Main.java
 * java -cp build/classes Main
 * 
 * Design Patterns Implemented:
 * 1. Composite Pattern: Village contains VillageComponents (House, Tree, WaterSource)
 * 2. Builder Pattern: Components are built from shapes using specific builders
 * 3. Abstract Factory Pattern: BrickVillageFactory and MudVillageFactory create families of objects
 * 4. Bridge Pattern: Shapes are separated from their color implementations
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("=== Welcome to Age of Villagers - Village Creator ===");
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            displayMenu();
            
            System.out.print("Enter your choice (1-3): ");
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    createBrickVillage();
                    break;
                case "2":
                    createMudVillage();
                    break;
                case "3":
                    System.out.println("Thank you for playing Age of Villagers! Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    System.out.println();
            }
            
            try {
                System.out.println("Press Enter to continue...");
                scanner.nextLine();
            } catch (Exception e) {
                // Handle case where input stream is closed or no more input
                break;
            }
            System.out.println();
        }
    }
    
    /**
     * Display the main menu options
     */
    private static void displayMenu() {
        System.out.println("Choose your village type:");
        System.out.println();
        System.out.println("1. Brick House + Mango Tree + Swimming Pool");
        System.out.println("2. Mud House + Banana Tree + Pond");
        System.out.println("3. Exit");
        System.out.println();
    }
    
    /**
     * Create a brick-style village using BrickVillageFactory (Abstract Factory Pattern)
     */
    private static void createBrickVillage() {
        System.out.println("Creating Brick Village...");
        System.out.println();
        
        // Abstract Factory Pattern: Use BrickVillageFactory to create family of objects
        AbstractVillageFactory factory = new BrickVillageFactory();
        
        // Create complete village using factory
        Village village = factory.createCompleteVillage("Brick Village");
        
        // Composite Pattern: Display the village and all its components
        village.display();
        
    }
    
    /**
     * Create a mud-style village using MudVillageFactory (Abstract Factory Pattern)
     */
    private static void createMudVillage() {
        System.out.println("Creating Mud Village...");
        System.out.println();
        
        // Abstract Factory Pattern: Use MudVillageFactory to create family of objects
        AbstractVillageFactory factory = new MudVillageFactory();
        
        // Create complete village using factory
        Village village = factory.createCompleteVillage("Mud Village");
        
        // Composite Pattern: Display the village and all its components
        village.display();
        
    }
    
}
