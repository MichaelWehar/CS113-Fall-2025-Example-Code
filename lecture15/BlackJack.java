import java.util.Scanner;
public class BlackJack {
	public static void main(String[] args) {
		// Checks if command line arguments are valid
		if(args.length != 1) {
			System.out.println("Invalid command line arguments");
			return;
		}
		// Keep track of current round and overall score
		int playerWins = 0;
		int numOfRounds = Integer.parseInt(args[0]);
		int round = 0;
		// Play rounds
		while(round < numOfRounds) {
			boolean playerWon = playRound();
			if(playerWon) {
				System.out.println("You won!");
				playerWins++;
			} else {
				System.out.println("You lost!");
			}
			// Print current score
			System.out.println("Your win count: " + playerWins + " / " + (round + 1));
			round++;
		}
	}
	public static int getRandomCard() {
		return (int)(1 + 11 * Math.random());
	}
	public static boolean playRound() {
		Scanner s = new Scanner(System.in);
		// Get house's starting hand
		int houseCard1 = getRandomCard();
		int houseCard2 = getRandomCard();
		int houseSum = houseCard1 + houseCard2;
		System.out.println("One of the dealer's cards is " + houseCard1 + ".");
		// Get my starting hand
		int myCard1 = getRandomCard();
		int myCard2 = getRandomCard();
		int mySum = myCard1 + myCard2;
		System.out.print("Your hand's value is " + mySum + ". ");
		System.out.println("What would you like to do: ");
		// Offer user to get more cards
		String input = "";
		while(mySum < 21 && !input.equals("stay")) {
			// User either enters "hit" or "stay"
			input = s.next().toLowerCase();
			if(input.equals("hit")) {
				mySum += getRandomCard();
				System.out.print("Your hand's new value is " + mySum + ". ");
				if(mySum < 21) {
					System.out.println("What would you like to do: ");
				} else {
					System.out.println();
				}
			} else if(!input.equals("stay")) {
				// This reprompts the user to enter a selection
				System.out.println(input + " is invalid.");
			}
		}
		System.out.println("The dealer's hand is " + houseSum + ".");
		// House gets more cards
		while(mySum <= 21 && houseSum < 15) {
			houseSum += getRandomCard();
			System.out.println("The dealer's hand is " + houseSum + ".");
		}
		// Check for winner
		return mySum < 21 && (mySum > houseSum || houseSum > 21);
	}
}
