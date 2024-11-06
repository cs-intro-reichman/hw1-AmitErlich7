// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int number = Integer.parseInt(args[0]);

		while (number > 0) {
			if (number > 100) {
				String numberString = Integer.toString(number);
				char firstDigit = numberString.charAt(0);
				System.out.println(firstDigit + " hundreds");	
				numberString = numberString.substring(1);
				number = Integer.parseInt(numberString);
			}
			if (number > 10) {
				String numberString = Integer.toString(number);
				char firstDigit = numberString.charAt(0);
				System.out.println(firstDigit + " tens");	
				numberString = numberString.substring(1);
				number = Integer.parseInt(numberString);
			}
			if (number > 1) {
				String numberString = Integer.toString(number);
				char firstDigit = numberString.charAt(0);
				System.out.println(firstDigit + " ones.");	
				numberString = numberString.substring(1);
				number = Integer.parseInt(numberString);
			}
		}

	}
}
