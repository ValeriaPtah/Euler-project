package problem1;

public class Problem1 {

//	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//	The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
	
	public static void main(String[] args) {
		int mult1 = 3;
		int mult2 = 5;
		int limit = 1000;

		Multiples euler1 = new Multiples();

		System.out.println("Final: " + euler1.multSum(mult1, mult2, limit));
		System.out.println("Check: " + euler1.testSum(mult1, mult2, limit));
	}

}
