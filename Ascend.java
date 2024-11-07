// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * max);
		int b = (int)(Math.random() * max);
		int c = (int)(Math.random() * max);
		int maxNum = Math.max(a, Math.max(b, c));
		int minNum = Math.min(a, Math.min(b, c));
		int midNum = a + b + c - maxNum - minNum; 
		System.out.println(minNum + " , " + midNum + " , " + maxNum);
		
		
	}
}
