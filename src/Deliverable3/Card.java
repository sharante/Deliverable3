/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable3;


public class Card {
    
    private Suit suit;
    private Values value;
    private int cardValue;
    
     /**
     * @sets the suit and value of the card through constructor
     */
    public Card(int suit , int value)
    {
        this.setSuit(suit);
        this.setValue(value);
    }
    
     /**
     * @sets the suit of the card
     */
    public void setSuit(int suit)
    {
        if(suit == 0)
        {
            this.suit = Suit.Clubs;
        }
        else if(suit == 1)
        {
            this.suit = Suit.Diamond;
        }
        else if(suit == 2)
        {
            this.suit = Suit.Hearts;
        }
        else if(suit == 3)
        {
            this.suit = Suit.Spade;
        }
    }
    
     /**
     * @returns the suit of the card
     */
    public Suit getSuit()
    {
        return this.suit; 
    }
    
     /**
     * @sets the value of the card
     */
    public void setValue(int value)
    {
         if(value == 0)
        {
            this.value = Values.One;
            this.cardValue = 1;
        }
          else if(value == 1)
        {
            this.value = Values.Two;
            this.cardValue = 2;
        }
          else if(value == 2)
        {
            this.value = Values.Three;
            this.cardValue = 3;
        }
          else if(value == 3)
        {
            this.value = Values.Four;
            this.cardValue = 4;
        }
          else if(value == 4)
        {
            this.value = Values.Five;
            this.cardValue = 5;
        }
          else if(value == 5)
        {
            this.value = Values.Six;
            this.cardValue = 6;
        }
          else if(value == 6)
        {
            this.value = Values.Seven;
            this.cardValue = 7;
        }
          else if(value == 7)
        {
            this.value = Values.Eight;
            this.cardValue = 8;
        }
          else if(value == 8)
        {
            this.value = Values.Nine;
            this.cardValue = 9;
        }
          else if(value == 9)
        {
            this.value = Values.Ten;
            this.cardValue = 10;
        }
    }
    
     /**
     * @returns the value of the card
     */
    public Values getValue()
    {
        return this.value;
    }
    
     /**
     * @returns the value of the card in integer
     */
    public int getCardValue()
    {
        return this.cardValue;
    }
    
     /**
     * @returns the value and suit of card as a string
     */
    public String toString()
    {
        String toString = this.getValue() + " of " +  this.getSuit();
        return toString;
    }

}
