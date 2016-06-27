package problem1;

public class Problem1 {

//	If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//	The sum of these multiples is 23.Find the sum of all the multiples of 3 or 5 below 1000.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiples euler1 = new Multiples();
		System.out.println(euler1.multSum(3, 5, 1000));
		System.out.println(euler1.testSum(3, 5, 1000));
	}

}
