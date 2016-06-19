package byui.cit260.escapeFromInsanityIsland.view;
import java.util.Scanner;

/**
 *
 * @author Andre Nell
 */

public class ViewInventoryView extends View {
    
    public ViewInventoryView() {
        super("\n"
                  + "\n Please enter your selection:"
                  + "\n------------------------------------------------"
                  + "\n| Inventory                                    |"
                  + "\n------------------------------------------------"
                  + "\nI - Display Inventory Items"
                  + "\n------------------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "I": // Attack beast; not a permanent menu item.
                this.displayViewInventoryItems();
                break;             
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false; 
    }

    private void displayViewInventoryItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}