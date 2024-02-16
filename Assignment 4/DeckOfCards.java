import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private List<Card> deck;

    public DeckOfCards() {
        createDeck();
    }

    public void createDeck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }

    public void printCard(int index) {
        if (index >= 0 && index < deck.size()) {
            System.out.println(deck.get(index));
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void sameCard() {
        // Implement logic to find and print cards of the same suit
    }

    public void compareCard() {
        // Implement logic to compare cards with the same rank
    }

    public void findCard(String rank, String suit) {
        // Implement logic to search for a particular card by rank and suit
    }

    public void dealCard() {
        // Implement logic to deal 5 random cards
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }
}

enum Suit {
    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
