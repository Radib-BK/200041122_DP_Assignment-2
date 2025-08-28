# Age of Villagers - Village Creator

A Java CLI application demonstrating **Composite**, **Builder**, **Abstract Factory**, and **Bridge** design patterns through village creation in Age of Villagers (AoV).

## Design Patterns Implemented

### 1. Composite Pattern
- **Village** acts as a composite containing multiple **VillageComponent** objects
- **VillageComponent** interface implemented by **House**, **Tree**, and **WaterSource**
- Allows uniform treatment of individual components and composites

### 2. Builder Pattern
- **VillageComponentBuilder** abstract class with concrete implementations:
  - **HouseBuilder** - builds houses from shapes
  - **TreeBuilder** - builds trees from shapes  
  - **WaterSourceBuilder** - builds water sources from shapes
- Components are constructed from geometric shapes (**Rectangle**, **Triangle**, **Circle**)

### 3. Abstract Factory Pattern
- **AbstractVillageFactory** defines interface for creating families of objects
- Two concrete factories:
  - **BrickVillageFactory** → Brick House + Mango Tree + Swimming Pool
  - **MudVillageFactory** → Mud House + Banana Tree + Pond

### 4. Bridge Pattern
- **Shape** interface acts as abstraction with **Color** interface as implementor
- Separates shape geometry from color implementation
- Allows independent variation of shapes and colors
- **Rectangle**, **Triangle**, **Circle** use **Red**, **White**, **Green**, **Brown**, **Blue** colors

## Running Instructions

### Compilation
```bash
# Compile Main.java and all dependencies
javac -d build/classes -sourcepath src/main/java src/main/java/Main.java
```

### Execution
```bash
# Run the application
java -cp build/classes Main
```

### Sample Output
```
=== Welcome to Age of Villagers - Village Creator ===

Choose your village type:

1. Brick House + Mango Tree + Swimming Pool
2. Mud House + Banana Tree + Pond
3. Exit

Enter your choice (1-3): 1
Creating Brick Village...

=== Brick Village ===
Village contains:
  Brick House:
    A white rectangle.
    A red triangle.
  Mango Tree:
    A brown rectangle.
    A green circle.
  Swimming Pool:
    A blue rectangle.

```

## Package Organization

### Entry Point
- **Main.java** - CLI application entry point (no package, located in `src/main/java/`)

### Shapes Package (`com.aov.shapes`)
- **Shape** - Interface for all geometric shapes (Bridge abstraction)
- **Rectangle**, **Triangle**, **Circle** - Concrete shape implementations with color support

### Colors Package (`com.aov.colors`)
- **Color** - Interface for color implementations (Bridge implementor)
- **Red**, **White**, **Green**, **Brown**, **Blue** - Concrete color implementations

### Village Package (`com.aov.village`)
- **VillageComponent** - Interface for village components (Composite Pattern)
- **House**, **Tree**, **WaterSource** - Concrete component implementations
- **Village** - Composite class containing multiple VillageComponents

### Builders Package (`com.aov.builders`)
- **VillageComponentBuilder** - Abstract builder class
- **HouseBuilder**, **TreeBuilder**, **WaterSourceBuilder** - Concrete builders

### Factories Package (`com.aov.factories`)
- **AbstractVillageFactory** - Abstract factory interface
- **BrickVillageFactory**, **MudVillageFactory** - Concrete factory implementations

### Controllers Package (`com.aov.controllers`)
- **VillageCreator** - Business logic controller for village creation operations

### UI Package (`com.aov.ui`)
- **CLIHandler** - User interface handler for command-line interactions

## Features

- **Interactive CLI** with menu-driven interface
- **Clean separation** of concerns using packages
- **Proper error handling** and input validation
- **Extensible design** - easy to add new village types or components
- **Clear demonstration** of all three design patterns working together

## File Structure Details

### Source Files (`src/main/java/`)
```
src/main/java/
├── Main.java                          # Entry point (follows industry standards)
└── com/aov/
    ├── shapes/
    │   ├── Shape.java                  # Interface (Bridge abstraction)
    │   ├── Rectangle.java              # Concrete shape with color
    │   ├── Triangle.java               # Concrete shape with color
    │   └── Circle.java                 # Concrete shape with color
    ├── colors/
    │   ├── Color.java                  # Interface (Bridge implementor)
    │   ├── Red.java                    # Concrete color
    │   ├── White.java                  # Concrete color
    │   ├── Green.java                  # Concrete color
    │   ├── Brown.java                  # Concrete color
    │   └── Blue.java                   # Concrete color
    ├── village/
    │   ├── VillageComponent.java       # Component interface
    │   ├── House.java                  # Leaf component
    │   ├── Tree.java                   # Leaf component
    │   ├── WaterSource.java            # Leaf component
    │   └── Village.java                # Composite
    ├── builders/
    │   ├── VillageComponentBuilder.java # Abstract builder
    │   ├── HouseBuilder.java           # Concrete builder
    │   ├── TreeBuilder.java            # Concrete builder
    │   └── WaterSourceBuilder.java     # Concrete builder
    ├── factories/
    │   ├── AbstractVillageFactory.java # Abstract factory
    │   ├── BrickVillageFactory.java    # Concrete factory
    │   └── MudVillageFactory.java      # Concrete factory
    ├── controllers/
    │   └── VillageCreator.java         # Business logic controller
    └── ui/
        └── CLIHandler.java             # User interface handler
```

### Compiled Classes (`build/classes/`)
```
build/classes/
├── Main.class                          # Entry point
└── com/aov/
    ├── shapes/                         # Shape classes (Bridge abstraction)
    ├── colors/                         # Color classes (Bridge implementor)
    ├── village/                        # Village components
    ├── builders/                       # Builder classes
    └── factories/                      # Factory classes
```

## Architecture & Industry Standards

### Clean Architecture Implementation
- **Main.java**: Pure entry point - only handles application startup
- **CLIHandler**: Presentation layer - handles user interface and input/output
- **VillageCreator**: Business logic layer - handles village creation operations
- **Domain Classes**: Core business entities (Village, VillageComponent, etc.)

### SOLID Principles Applied
- **Single Responsibility Principle**: Each class has one clear responsibility
- **Open/Closed Principle**: Easy to extend with new village types or components
- **Dependency Inversion**: High-level modules don't depend on low-level modules

### Industry Best Practices
- **Separation of Concerns**: UI logic separated from business logic
- **Package Organization**: Logical grouping of related classes
- **Clean Code**: Descriptive names, clear responsibilities, proper documentation

## Key Features

### Enhanced Visual Output
- **Step-by-step construction**: Shows each colored shape as it's added
- **Bridge Pattern demonstration**: Same shapes with different colors for different village types
- **Intuitive format**: "A [color] [shape]." for each component

### Village Type Differences
- **Brick Village**: White house base + red roof, brown tree trunk + green crown, blue swimming pool
- **Mud Village**: Brown house (base + roof), green banana tree (trunk + crown), green pond (rectangle)

### Pattern Integration
- All four design patterns work together seamlessly
- Bridge pattern allows easy color variations without changing shape logic
- Factory pattern determines color combinations for each village type
- Builder pattern constructs components step-by-step with colored shapes
- Composite pattern displays the complete village structure
