import java.util.Scanner;
public class Game {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	Board b = new Board(5, 5);
	System.out.println("Treasure location has been set!");
	int numOfGuesses = 0;
	int currentDistance = -1;
	while(currentDistance != 0) {
		System.out.println("Guess location: ");
		int x = s.nextInt();
		int y = s.nextInt();
		currentDistance = b.guessPosition(x, y);
		System.out.println("Your are " + currentDistance + " spaces away.");
		if(currentDistance < 0) {
			System.out.println("Invalid guess, try again!");
		}
		numOfGuesses++;
	}
	System.out.println("Congratulations!  You found the treasure in " + numOfGuesses + " guesses.");
  }
}
