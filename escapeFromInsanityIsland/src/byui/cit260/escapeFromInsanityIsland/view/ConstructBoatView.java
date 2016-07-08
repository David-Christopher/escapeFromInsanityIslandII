/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;
import byui.cit260.escapeFromInsanityIsland.control.BoatManufacture;
import java.util.Scanner;

/**
 *
 * @author Andre Nell
 */

public class ConstructBoatView extends View {
    
    public ConstructBoatView() {
        super("\n"
                + "\n***************************************************************"
                + "\n| You need  to construct a raft. The surface area of the raft *"
                + "\n| must be exactly 19.25 Square Yards. You have the following  *"
                + "\n| Items available on the Island to build your raft.           *"
                + "\n| - Short Logs that are 3.5 Yards long with .7 yard diameter. *"
                + "\n| - Long Logs that are 5.5 Yards long with .7 yard diameter.  *"
                + "\n| - 270ft of Vines from trees.                                *"
                + "\n| The floor of your raft must have no gaps. There must be 3   *"
                + "\n| cross members for support. Wherever logs cross they must be *"
                + "\n| lashed with vine. The vine must be braided so that they are *"
                + "\n| strong enough to withstand a sea voyage. Each rope must be  *"
                + "\n| 6ft in length once braided. How many of each of the         *"
                + "\n| following must you select to meet these requirements.       *"
                + "\n| - Number of Short Logs.                                     *"
                + "\n| - Number of Long Logs.                                      *"
                + "\n| - Number of braids.                                         *"
                + "\n***************************************************************"
                + "\n Enter the number of Short Logs you think you need:");
    }
 
    @Override
    public boolean doAction(String value) {
        value.toUpperCase(); // convert choice to upper case

                int shortLogs = 0;
                int longLogs = 0;
                int strands = 0;
            
                // Obtain selections from user
                shortLogs = Integer.parseInt(value);                
                this.setDisplayMessage("Enter the number of Long Logs you think you need: ");
                longLogs = Integer.parseInt(this.getInput());
                this.setDisplayMessage("Enter the number of strands each 6 ft rope should include: ");
                strands = Integer.parseInt(this.getInput()); 
                
            BoatManufacture boatManufacture = new BoatManufacture();
            if(boatManufacture.testTotalVine(shortLogs, longLogs, strands)){
                this.console.println("Congratulations, your estimates are correct!");
                return true;
            } 
        this.setDisplayMessage("Try again!" 
                + "\n Enter the number of Short Logs you think you need:");
        return false;
    }
}
