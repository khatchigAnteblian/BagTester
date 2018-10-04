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
    
    private String label;
    private String colour;
    private int numOfSheets;
    
    public Binder(String lbl, String clr, int num) {
        this.label = lbl;
        this.colour = clr;
        this.numOfSheets = num;
    }
    
    public void addSheet(int num) {
        System.out.println("Added " + num + " sheets.\n");
        this.setNumOfSheets(this.getNumOfSheets() + num);
    }

    public void removeSheet(int num) {
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
        return binderWeight + (this.getNumOfSheets() * paperWeight);
    }
    
    public Binder compareWeight(Binder other) {
        return this.getTotalWeight() > other.getTotalWeight() ? this : other;
    }
    
    public String toString() {
        return "Label: " + this.getLabel() + ", Colour: " + this.getColour() + ", Number of sheets: " + this.getNumOfSheets();
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the numOfSheets
     */
    public int getNumOfSheets() {
        return numOfSheets;
    }

    /**
     * @param numOfSheets the numOfSheets to set
     */
    public void setNumOfSheets(int numOfSheets) {
        this.numOfSheets = numOfSheets;
    }
}
