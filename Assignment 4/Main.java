import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Create Deck");
            System.out.println("2. Print Deck");
            System.out.println("3. Print Card");
            System.out.println("4. Same Card");
            System.out.println("5. Compare Card");
            System.out.println("6. Find Card");
            System.out.println("7. Deal Card");
            System.out.println("8. Shuffle Deck");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.createDeck();
                    break;
                case 2:
                    deck.printDeck();
                    break;
                case 3:
                    System.out.print("Enter index of card to print: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deck.printCard(index);
                    break;
                case 4:
                    deck.sameCard();
                    break;
                case 5:
                    deck.compareCard();
                    break;
                case 6:
                    System.out.print("Enter rank of card to find: ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter suit of card to find: ");
                    String suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
                case 7:
                    deck.dealCard();
                    break;
                case 8:
                    deck.shuffleDeck();
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 9.");
            }
        }

        scanner.close();
        System.out.println("Exiting...");
    }
}
