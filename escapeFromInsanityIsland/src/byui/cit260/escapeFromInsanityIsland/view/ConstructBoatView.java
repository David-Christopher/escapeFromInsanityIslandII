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
//
//public class ConstructBoatView extends View {
//    
////    public ConstructBoatView() {
////        super("\n"
////                + "\n***************************************************************"
////                + "\n| You need  to construct a raft. The surface area of the raft *"
////                + "\n| must be exactly 19.25 Square Yards. You have the following  *"
////                + "\n| Items available on the Island to build your raft.           *"
////                + "\n| - Short Logs that are 3.5 Yards long with .7 yard diameter. *"
////                + "\n| - Long Logs that are 5.5 Yards long with .7 yard diameter.  *"
////                + "\n| - 270ft of Vines from trees.                                *"
////                + "\n| The floor of your raft must have no gaps. There must be 3   *"
////                + "\n| cross members for support. Wherever logs cross they must be *"
////                + "\n| lashed with vine. The vine must be braided so that they are *"
////                + "\n| strong enough to withstand a sea voyage. Each rope must be  *"
////                + "\n| 6ft in length once braided. How many of each of the         *"
////                + "\n| following must you select to meet these requirements.       *"
////                + "\n| - Number of Short Logs.                                     *"
////                + "\n| - Number of Long Logs.                                      *"
////                + "\n| - Number of braids.                                         *"
////                + "\n***************************************************************");
////    }
 
//    @Override
//    public boolean doAction(int shortLogs, int longLogs, int strands) {
//        value.toUpperCase(); // convert choice to upper case
//
//
//            String value;
//            boolean done = false;
//            do {
//                int shortLogs = 0;
//                int longLogs = 0;
//                int strands = 0;
//            
//                // Obtain selections from user
//                System.out.println("Enter the number of Short Logs you think you need: ");
//                shortLogs = in.nextInt();
//                System.out.println("Enter the number of Long Logs you think you need: ");
//                longLogs = in.nextInt();
//                System.out.println("Enter the number of strands each 6 ft rope should include: ");
//                strands = in.nextInt(); 
//                
//                done = this.doAction(shortLogs, longLogs, strands);
//        return false; 
//    }