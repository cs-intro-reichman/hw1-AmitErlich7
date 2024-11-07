// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);
		int hundreds;
		int tens;
		int ones;
		ones = number % 10;
		tens = (int)(number % 100) / 10;
		hundreds = number / 100;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
		}

	}

