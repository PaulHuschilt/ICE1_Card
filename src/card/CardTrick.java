/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi, Paul Huschilt. Student #: 991727485
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(1, 13));
            c.setSuit(Card.SUITS[rand.nextInt(0, 3)]);
            magicHand[i] = c;
        }
        // User Input
        Card userCard = new Card();
        System.out.println("Enter Card Value");
        int value = scan.nextInt();
        userCard.setValue(value);
        
        System.out.println("Enter Card Suit");
        String suit = scan.next();
        userCard.setSuit(suit);
        
        // Search The hand for user card
        boolean found = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == value && magicHand[i].getSuit().equals(suit)) {
                System.out.println("Card Found at index: " + i);
                found = true;
                break; // Exit the loop once a match is found
            }
        }
        
        if (!found) {
            System.out.println("Card not found in hand.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
       Card luckCard = new Card();
       luckCard.setValue(2);
       luckCard.setSuit("clubs");
    }
    
}
