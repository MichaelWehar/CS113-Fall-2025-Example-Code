public class IfStatement {
	public static double museumTicketPrice(int age) {
		if(age >= 65) {
			// Senior citizen discount
			return 10.50;
		} else if(age >= 18) {
			// Adult's pay full price
			return  14.0;
		} else {
			// Child discount
			return 9.50;
		}
	}
	public static void printTicketPrice(String name, int age) {
		double price = museumTicketPrice(age);
		System.out.printf("%s must pay $%.2f to purchase a ticket.\n", name, price);
	}
	public static void main(String[] args) {
		printTicketPrice("Bob", 67);
		printTicketPrice("Sally", 25);
		printTicketPrice("Johnny", 10);
	}
}
