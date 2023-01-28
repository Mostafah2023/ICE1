package exercise1;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Mostafa Hussain | Modified on 1/27/2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //Random generation 0-12 (13 values)
            card.setValue((int)(Math.random()*13));
            
            //Random generation 0-3 (4 values)
            card.setSuit(Card.SUITS[((int)(Math.random()*3)+1)]);
           
            //assign object to index i in hand array
            hand[i] = card;
            
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        Card userCard = new Card();
        System.out.println("Enter a card value (1-13): ");
        userCard.setValue(scan.nextInt());
        System.out.println("Enter a Suit : ");
        userCard.setSuit(scan.next());
        
        for(int i = 0; i < hand.length;i++){
            if(hand[i].getValue() == userCard.getValue())
                if(hand[i].getSuit().equalsIgnoreCase(userCard.getSuit()))
                    printInfo();
        }
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Mostafa Hussain
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mostafa Hussain, but you can call me Moose or Moe.");
        System.out.println();
        
        System.out.println("Where I see myself in 5 years?");
        System.out.println("-- I see myself working for a great Software Dev company");
        System.out.println("-- Job security and pay are the two important factors for me");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Being virtually creative (App dev/Web dev)");
        System.out.println("-- Cooking");
        System.out.println("-- Watching Youtube");
        System.out.println("-- Gaming");

        System.out.println();
        
    
    }

}
