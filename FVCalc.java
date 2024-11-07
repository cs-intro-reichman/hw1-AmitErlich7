// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		// n represents the years.
		double ratePrecentage = rate*0.01;
		double futureValue;
		futureValue = currentValue * (Math.pow((ratePrecentage + 1) , n));
		System.out.println("After " + (int)n + " years, a" + " $" + currentValue + " saved at " + rate + "%" + " will yield " + "$"  + (int)futureValue);


	}
}