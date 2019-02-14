package problem1;


public class Multiples {

	//finds a sum of all numbers in N divided by DIV
	private int arSum (int n, int div) { //DIV is also a first member of a progression
		int sum;
		int amount = (n - 1) / div; //number of members
		
		sum = (2*div + div*(amount-1))*((amount/2)+(amount%2));
		
		return sum;
	}
	
	public int multSum (int div1, int div2, int n) {

		int sum = arSum(n, div1) + arSum(n, div2) - arSum(n, div1 * div2);
		//add two arithmetic progression with d = div1 and d = div2
		//but extract sum of (div1 * div2) to avoid duplicates (15 for 3 and 5)

		return sum;
	}

	//brute-force sum
	public int testSum (int div1, int div2, int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			if ((i % div1 == 0) || (i % div2 == 0))
				sum += i;

		return sum;
	}
}
