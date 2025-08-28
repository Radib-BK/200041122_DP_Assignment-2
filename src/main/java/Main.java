import com.aov.ui.CLIHandler;

/**
 * Main class - Entry point for Age of Villagers CLI application
 * Follows industry standards: Main class only handles application startup
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
 * 
 * Architecture:
 * - Main: Application entry point (follows Single Responsibility Principle)
 * - CLIHandler: Handles user interface and presentation logic
 * - VillageCreator: Handles business logic for village creation
 * - Proper separation of concerns following industry standards
 */
public class Main {
    
    /**
     * Application entry point
     * Delegates to CLIHandler following separation of concerns principle
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        CLIHandler cliHandler = new CLIHandler();
        cliHandler.start();
    }
}