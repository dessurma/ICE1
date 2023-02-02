package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Matthew Dessureault Feb 1st, 2023 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
    Card[] hand = new Card[7];
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    
    for (int i = 0; i < hand.length; i++) {
        Card card = new Card();
        card.setValue(random.nextInt(13) + 1);
        card.setSuit(Card.SUITS[random.nextInt(4)]);
        hand[i] = card;
    }

    System.out.println("Pick a card, any card (enter value and suit separated by a space):");
    int userValue = input.nextInt();
    String userSuit = input.next();
    Card userCard = new Card(userValue, userSuit);
    
    boolean found = false;
    for (int i = 0; i < hand.length; i++) {
        if (hand[i].getValue() == userCard.getValue() && hand[i].getSuit().equals(userCard.getSuit())) {
            found = true;
            break;
        }
    }
    
    if (found) {
        printInfo();
    } else {
        System.out.println("Sorry, your card was not found in the hand.");
    }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author  Matthew Dessureault Feb 1st 2023
     */
    private static void printInfo() {
    	System.out.println("I'm Done!");
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Matthew, but you can call me student, Matt or sir");
        System.out.println();
        
        System.out.println("I will become a web programmer:");
        System.out.println("-- Use less social media");
        System.out.println("-- This semester I have no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Working out");

        System.out.println();
        
    
    }

}
