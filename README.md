# Age of Villagers - Village Creator

A Java CLI application demonstrating **Composite**, **Builder**, and **Abstract Factory** design patterns through village creation in Age of Villagers (AoV).

## Project Structure

```
200041122_DP_Assignment-2/
├── src/main/java/
│   ├── Main.java             # Main CLI application (entry point)
│   └── com/aov/
│       ├── shapes/           # Shape classes (Rectangle, Triangle, Circle)
│       ├── village/          # Village components (House, Tree, WaterSource, Village)
│       ├── builders/         # Builder pattern implementations
│       └── factories/        # Abstract Factory pattern implementations
├── build/classes/            # Compiled .class files (organized by package)
└── README.md                 # This file
```

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
  Brick House built with [Rectangle, Triangle]
  Mango Tree built with [Rectangle, Circle]
  Swimming Pool built with [Rectangle]

=== Design Patterns Demonstrated ===
1. Composite Pattern: Village contains multiple VillageComponents
2. Builder Pattern: Components built from geometric shapes
3. Abstract Factory: Different factories create different families of objects
```

## Package Organization

### Entry Point
- **Main.java** - CLI application entry point (no package, located in `src/main/java/`)

### Shapes Package (`com.aov.shapes`)
- **Shape** - Interface for all geometric shapes
- **Rectangle**, **Triangle**, **Circle** - Concrete shape implementations

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
├── Main.java                          # Entry point (no package)
└── com/aov/
    ├── shapes/
    │   ├── Shape.java                  # Interface
    │   ├── Rectangle.java              # Concrete shape
    │   ├── Triangle.java               # Concrete shape
    │   └── Circle.java                 # Concrete shape
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
    └── factories/
        ├── AbstractVillageFactory.java # Abstract factory
        ├── BrickVillageFactory.java    # Concrete factory
        └── MudVillageFactory.java      # Concrete factory
```

### Compiled Classes (`build/classes/`)
```
build/classes/
├── Main.class                          # Entry point
└── com/aov/
    ├── shapes/                         # Shape classes
    ├── village/                        # Village components
    ├── builders/                       # Builder classes
    └── factories/                      # Factory classes
```

## Requirements Met

✅ Plain Java CLI project (no Gradle, no Maven)  
✅ Composite Pattern - Village contains VillageComponents  
✅ Builder Pattern - Components built from shapes  
✅ Abstract Factory Pattern - Two factory families  
✅ Proper package structure with organized .class files in build/classes/  
✅ Clean root directory (no stray .java/.class files)  
✅ Clear comments explaining pattern usage  
✅ Updated running instructions for new structure  
