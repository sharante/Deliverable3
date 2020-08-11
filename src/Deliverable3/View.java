/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deliverable3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author antes
 */
public class View {
    
    
    public View() {
    System.out.println("Welcome to BlackJack");
  }
    
    public void askUser()
    {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
            /**
     * @asks for number of Players
     * 
     */
         int n = 0;
         while (n==0)
         {
        System.out.println("Enter number of Players (1 to 3 )");
        int numPlayers = scan.nextInt();
        Player[] AllPlayers = new Player[numPlayers];
        if (numPlayers > 3 || numPlayers < 0) {
            System.out.println(" Oops !!! Invalid number of Players passed");
        } else {
            for (int i = 0; i < numPlayers; i++) {

                String name = scan.nextLine();
                 /**
     * @asks for name of the player
     */
                System.out.println("Enter Player 's Name and Then Hit Enter to Confirm :");
                String name2 = scan.nextLine();
                Player p = new Player(name2);
                AllPlayers[i] = p;
            }
            System.out.println("Hello All , My Name is James Bond  (;  \n   Your Dealer for the day \n Instructions : The Dealer will deal 2 Cards to each player , if the total of the value of cards is greater than 21 (You Looose ) , if it is equal to 21 (You Win) \n and if it is less than 21 , the dealer will keep on Dealing cards until a result. \nLet's Play \n Dealing 2 Cards to All " + " (:");
            scan.nextLine();
            int rndValues = 0;
            int rndSuit = 0;
            Card[] AllCards = new Card[52];
            for (int i = 0; i < 52; i++) {
                rndValues = rnd.nextInt(10);
                rndSuit = rnd.nextInt(3);
                Card c = new Card(rndSuit, rndValues);
                AllCards[i] = c;
            }

            int cardValue;
            int c = rnd.nextInt(52);
            for (int i = 0; i < numPlayers; i++) {
                int a = rnd.nextInt(52);
                int b = rnd.nextInt(52);
                cardValue = AllCards[a].getCardValue() + AllCards[b].getCardValue();
                System.out.println("\n" + AllPlayers[i].getName() + " : " + AllCards[a].toString() + " and " + AllCards[b].toString());
                AllPlayers[i].setCardValue(cardValue);
                System.out.println("Total Value : " + cardValue);
                scan.nextLine();
                int e = rnd.nextInt(52);
                int f = rnd.nextInt(52);
                if (AllPlayers[i].getCardValue() == 21) {
                    System.out.println(AllPlayers[i].getName() + " : You Won");
                } else if (AllPlayers[i].getCardValue() > 21) {
                    System.out.println(AllPlayers[i].getName() + " : You Lost");
                }
                else {
                    System.out.println("1. Exit  \n 2. Deal more cards ");
                    int selection = scan.nextInt();
                    if(selection ==1)
                    {
                        n = 1;
                    }
                 else  {
                    scan.nextLine();
                    System.out.println("Dealing more Cards");
                    System.out.println(AllPlayers[i].getName() + " : " + AllCards[e].toString() + " and " + AllCards[f].toString());
                    int cardValue2 = AllCards[e].getCardValue() + AllCards[f].getCardValue();
                    int totalValue = cardValue + cardValue2;
                    System.out.println("Total Value : " + totalValue);

                    if (totalValue == 21) {
                        System.out.println(AllPlayers[i].getName() + " : You Won");
                    } else if (totalValue > 21) {
                        System.out.println(AllPlayers[i].getName() + " : You Lost"); 
                         System.out.println("Play Again ? \n 1.No \n 2. Yes");
                        int selection4 = scan.nextInt();
                        if(selection4 ==  1)
                        {
                            n= 1;
                        }
                    
                    
                    }
                    else {
                        System.out.println("1. Exit  \n 2. Deal more cards ");
                    int selection2 = scan.nextInt();
                    if(selection2 ==1)
                    {
                        break;
                    }
         
                     else {
                        int g = rnd.nextInt(52);
                        int h = rnd.nextInt(52);
                        scan.nextLine();
                        System.out.println("Dealing more Cards");
                        System.out.println(AllPlayers[i].getName() + " : " + AllCards[g].toString() + " and " + AllCards[h].toString());
                        int cardValue3 = AllCards[g].getCardValue() + AllCards[h].getCardValue();
                        int totalValue2 = cardValue + cardValue2 + cardValue3;
                        System.out.println("Total Value : " + totalValue2);
                        if (totalValue2 == 21) {
                            System.out.println(AllPlayers[i].getName() + " : You Won");
                        } else {
                            System.out.println(" You Lost");
                        }
                        System.out.println("Play Again ? \n 1.No \n 2. Yes");
                        int selection3 = scan.nextInt();
                        if(selection3 ==  1)
                        { n=1;
                            break;
                        }
                    }
                }
            }

        }
    }

}}
    }
    
    
}
