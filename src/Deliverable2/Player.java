/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable2;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author Megha Patel
 */
public class Player {

    private String name; 
    private int cardValue;
    
    /**
     * @sets the player name through constructor
     */
    public Player(String name ) {
       this.setName(name);
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name ) {
        this.name = name;
    }
    
    /**
     * @sets the value of the card in player's hand
     */
    public void setCardValue(int value)
    {
        this.cardValue = value;
      
    }
    
    /**
     * @return the value of the card in player's hand
     */
    public int getCardValue()
    {
        return this.cardValue;
    }

}
