package com.aov.village;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.Shape;

/**
 * Tree class - Concrete implementation of VillageComponent
 * Part of Composite Pattern - represents a leaf component
 */
public class Tree implements VillageComponent {
    private String treeType;
    private List<Shape> shapes;
    
    public Tree(String treeType, List<Shape> shapes) {
        this.treeType = treeType;
        this.shapes = new ArrayList<>(shapes);
    }
    
    @Override
    public void display() {
        System.out.println("  " + treeType + " built with " + getShapesList());
    }
    
    @Override
    public String getComponentType() {
        return "Tree";
    }
    
    @Override
    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }
    
    public String getTreeType() {
        return treeType;
    }
    
    /**
     * Helper method to format shapes list for display
     */
    private String getShapesList() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < shapes.size(); i++) {
            sb.append(shapes.get(i).getType());
            if (i < shapes.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
