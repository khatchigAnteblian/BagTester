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
    
    private String style;
    private Binder[] binders = new Binder[2];
    
    public SchoolBag(String style, Binder binder1, Binder binder2) {
        this.style = style;
        this.binders[0] = binder1;
        this.binders[1] = binder2;
    }
    
    public SchoolBag(String style, String lbl1, String lbl2, String clr1, String clr2, int num1, int num2) {
        this.style = style;
        this.binders[0] = new Binder(lbl1, clr1, num1);
        this.binders[1] = new Binder(lbl2, clr2, num2);
    }
}
