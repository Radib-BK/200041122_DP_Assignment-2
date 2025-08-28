package com.aov.builders;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.*;
import com.aov.village.*;

/**
 * TreeBuilder - Concrete Builder Pattern implementation for trees
 * Builds Tree objects from shapes
 */
public class TreeBuilder extends VillageComponentBuilder {
    
    /**
     * Build a tree from the accumulated shapes
     * @param treeType Type of tree to build (e.g., "Mango Tree", "Banana Tree")
     * @return Tree object built from shapes
     */
    @Override
    public VillageComponent build(String treeType) {
        if (shapes.isEmpty()) {
            throw new IllegalStateException("Cannot build tree without shapes");
        }
        
        Tree tree = new Tree(treeType, new ArrayList<>(shapes));
        reset(); // Clear shapes for next build
        return tree;
    }
    
    /**
     * Convenience method to create a typical tree structure with colors
     * @param treeType Type of tree
     * @param trunkColor Color for the tree trunk
     * @param crownColor Color for the tree crown
     * @return Built tree component
     */
    public VillageComponent buildTypicalTree(String treeType, com.aov.colors.Color trunkColor, com.aov.colors.Color crownColor) {
        // Typical tree: rectangle trunk + circle crown
        addShape(new Rectangle(2.0, 6.0, trunkColor)) // Tree trunk
            .addShape(new Circle(4.0, crownColor)); // Tree crown
        return build(treeType);
    }
}
