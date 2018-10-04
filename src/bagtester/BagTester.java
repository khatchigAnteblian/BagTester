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
import java.util.Scanner;
public class BagTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Set up scanner and variables to hold parameters
        Scanner sc = new Scanner(System.in);
        String[] styles = new String[2];
        String[] labels = new String[2];
        String[] colours = new String[2];
        int[] sheets = new int[2];
        // Array to hold SchoolBag objects
        SchoolBag[] bags = new SchoolBag[2];

        // Ask user to enter all the information and assign them to variables
        for (int i=0; i<2; i++) {
            System.out.print("Enter style for bag " + (i + 1) + ": ");
            styles[i] = sc.nextLine();
            for (int j=0; j<2; j++) {
                System.out.print("Enter label for binder " + (j + 1) + " in bag " + (i + 1) + ": " );
                labels[j] = sc.nextLine();
                System.out.print("Enter colour for binder " + (j + 1) + " in bag " + (i + 1) + ": " );
                colours[j] = sc.nextLine();
                System.out.print("Enter number of sheets for binder " + (j + 1) + " in bag " + (i + 1) + ": " );
                sheets[j] = sc.nextInt();
                sc.nextLine();
                System.out.println();
            }
            // Declare binders using given information
            Binder b1 = new Binder(labels[0], colours[0], sheets[0]);
            Binder b2 = new Binder(labels[1], colours[1], sheets[1]);
            bags[i] = new SchoolBag(styles[i], b1, b2);
        }

        while (true) {
            // Keep asking user for bag and binder and whether they want to add or remove sheets
            System.out.println("\nThese are your bags:\n\n" + bags[0].toString() + "\n" + bags[1].toString() + "\n");
            int bag, binder, num;
            char choice;
            System.out.print("Which bag do you want (1, 2)? ");
            bag = sc.nextInt();
            System.out.print("Which binder do you want (1, 2)? ");
            binder = sc.nextInt();
            System.out.print("Do you want to add or remove sheets (a, r)? ");
            choice = sc.next().charAt(0);
            System.out.print("How many sheets? ");
            num = sc.nextInt();

            // Exit when user enters -1
            if (bag == -1 || binder == -1 || num == -1) {
                break;
            }

            // Call method based on choice
            if (choice == 'r') {
                bags[bag - 1].removeSheet(binder, num);
            } else {
                bags[bag - 1].addSheet(binder, num);
            }
        }

        System.out.println("\nGoodbye!");

    }
    
}
