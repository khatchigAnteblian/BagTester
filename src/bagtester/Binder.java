/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagtester;

/**
 *
 * @author 345983704
 */
public class Binder {
    
    public static int binderWeight = 150; // In grams
    public static double paperWeight = 5.0; // In grams
    
    private String label; // Binder label
    private String colour; // Binder colour
    private int numOfSheets; // Number of sheets in binder
    
    public Binder(String lbl, String clr, int num) {
        // Set up binder
        this.label = lbl;
        this.colour = clr;
        this.numOfSheets = num;
    }
    
    public void addSheet(int num) {
        System.out.println("Added " + num + " sheets.\n");
        this.setNumOfSheets(this.getNumOfSheets() + num);
    }

    public void removeSheet(int num) {
        // Before removing, check to make sure num is less than number of sheets in binder
        // and that binder has any sheets at all
        if (this.numOfSheets == 0) {
            System.out.println("No sheets in binder!\n");
        } else if (num >= this.numOfSheets) {
            System.out.println("Removed " + this.numOfSheets + " sheets.\n");
            this.numOfSheets = 0;
        } else {
            System.out.println("Removed " + num + " sheets.\n");
            this.numOfSheets -= num;
        }
    }
    
    public double getTotalWeight() {
        // Get weight of the binder plus total weight of all the sheets
        return binderWeight + (this.getNumOfSheets() * paperWeight);
    }
    
    public Binder compareWeight(Binder other) {
        // Return the heavier binder
        return this.getTotalWeight() > other.getTotalWeight() ? this : other;
    }
    
    public String toString() {
        // Print label, colour, and number of sheets for the binder
        return "Label: " + this.getLabel() + ", Colour: " + this.getColour() + ", Number of sheets: " + this.getNumOfSheets();
    }

    // Getters and setters
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getNumOfSheets() {
        return numOfSheets;
    }

    public void setNumOfSheets(int numOfSheets) {
        this.numOfSheets = numOfSheets;
    }
}
