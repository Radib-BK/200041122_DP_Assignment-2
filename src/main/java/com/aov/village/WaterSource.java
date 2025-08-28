package com.aov.village;

import java.util.List;
import java.util.ArrayList;
import com.aov.shapes.Shape;

/**
 * WaterSource class - Concrete implementation of VillageComponent
 * Part of Composite Pattern - represents a leaf component
 */
public class WaterSource implements VillageComponent {
    private String waterSourceType;
    private List<Shape> shapes;
    
    public WaterSource(String waterSourceType, List<Shape> shapes) {
        this.waterSourceType = waterSourceType;
        this.shapes = new ArrayList<>(shapes);
    }
    
    @Override
    public void display() {
        System.out.println("  " + waterSourceType + ":");
        for (Shape shape : shapes) {
            System.out.println("    " + shape.getColoredDescription() + ".");
        }
    }
    
    @Override
    public String getComponentType() {
        return "WaterSource";
    }
    
    @Override
    public List<Shape> getShapes() {
        return new ArrayList<>(shapes);
    }
    
    public String getWaterSourceType() {
        return waterSourceType;
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
