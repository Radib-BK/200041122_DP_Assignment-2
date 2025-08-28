package com.aov.village;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.Shape;

/**
 * House class - Concrete implementation of VillageComponent
 * Part of Composite Pattern - represents a leaf component
 */
public class House implements VillageComponent {
    private String houseType;
    private List<Shape> shapes;
    
    public House(String houseType, List<Shape> shapes) {
        this.houseType = houseType;
        this.shapes = new ArrayList<>(shapes);
    }
    
    @Override
    public void display() {
        System.out.println("  " + houseType + ":");
        for (Shape shape : shapes) {
            System.out.println("    " + shape.getColoredDescription() + ".");
        }
    }
    
    @Override
    public String getComponentType() {
        return "House";
    }
    
    @Override
    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }
    
    public String getHouseType() {
        return houseType;
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
