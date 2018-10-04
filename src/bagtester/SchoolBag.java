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
public class SchoolBag {
    
    public static final int bagWeight = 600; // In grams
    
    private String style; // Style of schoolbag
    private Binder[] binders = new Binder[2]; // Array to hold the binders
    
    public SchoolBag(String style, Binder binder1, Binder binder2) {
        // Set up schoolbag with binders
        this.style = style;
        this.binders[0] = binder1;
        this.binders[1] = binder2;
    }
    
    public SchoolBag(String style, String lbl1, String lbl2, String clr1, String clr2, int num1, int num2) {
        // When parameters are given instead of objects, declare new binders
        this.style = style;
        this.binders[0] = new Binder(lbl1, clr1, num1);
        this.binders[1] = new Binder(lbl2, clr2, num2);
    }

    public void addSheet(int binderID, int num) {
        // Wrapper method for binder addSheet
        this.binders[binderID - 1].addSheet(num);
    }
    
    public void removeSheet(int binderID, int num) {
        // Wrapper method for binder removeSheet
        this.binders[binderID - 1].removeSheet(num);
    }

    public double getBinderWeight(int binderID) {
        // Wrapper method for binder getTotalWeight
        return this.binders[binderID - 1].getTotalWeight();
    }

    public double getBagWeight() {
        // Return empty bag weight plus total weights of the two binders
        return bagWeight + this.binders[0].getTotalWeight() + this.binders[1].getTotalWeight();
    }

    public String toString() {
        // Return style for bag and information on each binder
        return "Style: " + this.style + "\nBinder 1:\n\t" + this.binders[0].toString() + "\nBinder 2:\n\t" + this.binders[1].toString() + "\n";
    }

    // Getters and setters
    public String getStyle() {
        return this.style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Binder getBinder(int binderID) {
        return this.binders[binderID - 1];
    }

    public void setBinder(int binderID, Binder binder) {
        this.binders[binderID - 1] = binder;
    }
}
