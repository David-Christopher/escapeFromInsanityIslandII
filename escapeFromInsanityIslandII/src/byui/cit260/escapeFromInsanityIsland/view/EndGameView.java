/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escapeFromInsanityIsland.view;

import byui.cit260.escapeFromInsanityIsland.model.Game;
import byui.cit260.escapeFromInsanityIsland.model.Item;

/**
 *
 * @author andrenell
 */
public class EndGameView extends View {


    public EndGameView() {
        super("viewEndOfGame.txt", true);
    }

    @Override
    public boolean doAction(String value) {

        return true;
    }}
