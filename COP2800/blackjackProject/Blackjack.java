import java.util.Scanner;
public class Blackjack {

    // ----------------------------------------- FUNCTIONS ----------------------------------------------------------//

    // Tell the user what card they have drawn 
    public static String CardFaceValue(int cardNumber) {
        String message = "Your card is a ";

        if (cardNumber > 1 && cardNumber < 11)
            {message = message + cardNumber + "! \n";}
        else if (cardNumber == 1)
            {message = message + "ACE! \n";}
        else if (cardNumber == 11)
            {message = message + "JACK! \n";}
        else if (cardNumber == 12)
            {message = message + "QUEEN! \n";}
        else if (cardNumber == 13)
            {message = message + "KING! \n";}

        return message;
    }
    
    // Evaluate card as a number value 
    public static int CardNumberValue(int randomNumber) {
        int cardValue;
        if (randomNumber < 11) {
            cardValue = randomNumber;
            return cardValue;
        } 
        else {
            cardValue = 10;
            return cardValue;
        }
    }
    
    // Calculate game statistics 
    public static double PercentageOfWins(int totalGames, int totalWins) {
        double percentWins;
        percentWins = (((double) totalWins) / ((double) totalGames)) * 100;
        return percentWins;
    }

    //Menu screen// 
    public static void PrintMenu() {
        String menu;
        menu = "1. Get another card \n";
        menu = menu + "2. Hold hand\n";
        menu = menu + "3. Print statistics\n";
        menu = menu + "4. Exit\n";
        menu = menu + "\n";
        menu = menu + "Choose an option: ";
        System.out.print(menu);
    }

    public static void PrintSummary(int playerWins, int dealerWins, int ties, int gamesPlayed) {
        System.out.println("Number of Player wins: " + playerWins);
        System.out.println("Number of Dealer wins: " + dealerWins);
        System.out.println("Number of tie games: " + ties);
        System.out.println("Total # of games played is: " + gamesPlayed);
        System.out.println("Percentage of Player wins: " + PercentageOfWins(gamesPlayed, playerWins) + "%\n");
    }

    // --------------------------------------------------        BLACKJACK             --------------------------------------------------------------------//
    // To play Blackjack, run Blackjack.main()    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        P1Random randomGenerator = new P1Random();

        //Game info//
        int playerHand;
        String playerCard;
        int newCard;
        int playerInput;

        //Statistics//
        int gamesPlayed = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        int dealerHand;
        boolean isThereAWinner;
      
        /* ---------------------------------------------- */

        //Start the game//
        do {
            gamesPlayed += 1;
            isThereAWinner = false;
            System.out.println("START GAME #" + gamesPlayed + "\n");
            //Reset Player & Dealer hand
            playerHand = 0;
            newCard = 0;
            dealerHand = 0;
            playerInput = 1;

            newCard = randomGenerator.nextInt(13) + 1;
            playerHand = playerHand + CardNumberValue(newCard);
            playerCard = CardFaceValue(newCard);
            System.out.print(playerCard);
            System.out.println("Your hand is: " + playerHand + "\n");

            do {
                PrintMenu();
                playerInput = scanner.nextInt();
                System.out.println();

                switch (playerInput) {
                    case 1:
                        newCard = randomGenerator.nextInt(13) + 1;
                        playerHand = playerHand + CardNumberValue(newCard);
                        playerCard = CardFaceValue(newCard);
                        System.out.print(playerCard);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();

                        if (playerHand > 21) {
                            System.out.println("You exceeded 21! You lose.\n");
                            dealerWins += 1;
                            isThereAWinner = true;
                            break;
                        } else if (playerHand == 21) {
                            System.out.println("BLACKJACK! You win!\n");
                            playerWins += 1;
                            isThereAWinner = true;
                        }
                        break;

                    case 2:// Give dealer a card
                        dealerHand = randomGenerator.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        if (dealerHand > 21 || dealerHand < playerHand) {
                            System.out.println("\nYou win!\n");
                            playerWins += 1;
                        } else if (dealerHand == playerHand) {
                            System.out.println("\nIt's a tie! No one wins!\n");
                            ties += 1;
                        } else if (dealerHand > playerHand) {
                            System.out.println("\nDealer wins!\n");
                            dealerWins += 1;
                        }
                        isThereAWinner = true;
                        break;

                    case 3:
                        PrintSummary(playerWins, dealerWins, ties, gamesPlayed - 1);
                        break;

                    case 4:
                        isThereAWinner = true;
                        break;

                    default:
                        System.out.println("Invalid input!");
                        System.out.println("Please enter an integer value between 1 and 4.\n");
                        break;
                }
            } while (!isThereAWinner);
        } while (playerInput != 4);
    }
}
