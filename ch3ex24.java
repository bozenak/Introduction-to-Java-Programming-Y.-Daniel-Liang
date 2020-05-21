//Game: pick a card)
/*
Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
example:
The card you picked is Jack of Hearts
 */
public class ch3ex24 {
    public static void main(String[] args) {
        int rank = (int)(Math.random() * ((13 - 1) +1) + 1);

        String card = "";
        switch(rank){
            case 1: card = "Ace";
            break;
            case 2: card = "2";
            break;
            case 3: card = "3";
            break;
            case 4: card = "4";
            break;
            case 5: card = "5";
            break;
            case 6: card = "6";
            break;
            case 7: card = "7";
            break;
            case 8: card = "8";
            break;
            case 9: card = "9";
            break;
            case 10: card = "Jack";
            break;
            case 11: card = "Queen";
            break;
            case 12: card = "King";
            break;
        }

        int suit = (int)(Math.random() * ((4 - 1) + 1) + 1);
        String colour = "";
        switch(suit){
            case 1: colour = "Clubs";
            break;
            case 2: colour = "Diamonds";
            break;
            case 3: colour = "Hearts";
            break;
            case 4: colour = "Spades";
            break;
        }

        System.out.println("The card you picked is " + card + " of " + colour);
    }
}
