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
     * Convenience method to create a typical tree structure
     * @param treeType Type of tree
     * @return Built tree component
     */
    public VillageComponent buildTypicalTree(String treeType) {
        // Typical tree: rectangle trunk + circle crown
        addShape(new Rectangle(2.0, 6.0)) // Tree trunk
            .addShape(new Circle(4.0)); // Tree crown
        return build(treeType);
    }
}
