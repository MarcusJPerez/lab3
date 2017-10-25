import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		int userInt = 0;

		Scanner scan = new Scanner(System.in);
		String divider = "========";
		char charCheck = 'Y'; // another one

		while (charCheck == 'y' || charCheck == 'Y') {

			System.out.print("Please enter an integer: ");
			userInt = scan.nextInt();

			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", divider, divider, divider);
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%-10s %-10s %-10s\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
			}
			System.out.println("Would you like to calculate another room? (y/n) ");
			while (!scan.hasNext("[yYnN]")) {
				System.out.print("Enter Y to continue or N to stop. ");
				scan.next();
			}
			charCheck = scan.next().charAt(0);

		}
	}
}
