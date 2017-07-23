import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		int numGuess = 75;
		int currNum = 50;
		Scanner sc = new Scanner(System.in);
		String H = "H";
		String L = "L";
		int counter = 15;
		Random rg = new Random();
		int randomNum;
		while (numGuess != currNum) {
			System.out.println("Is your number higher(H) or lower(L) than :" + currNum);
			String input = sc.nextLine();
			input.trim();
			input = input.toUpperCase();

			if (input.equals(H)) {
				randomNum = rg.nextInt(counter);
				currNum += randomNum;
			
			}
			if (input.equals(L)) {
				randomNum = rg.nextInt(counter);
				currNum -= randomNum;
			}
			counter--;
			
			

		}
		System.out.println("Your number is " + currNum);
	}

}
