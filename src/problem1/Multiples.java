package problem1;

public class Multiples {
	
	private int div1;
	private int div2;

	public Multiples() {
		this(3, 5);
	}
	
	public Multiples(int div1, int div2) {
		this.div1 = div1;
		this.div2 = div2;
	}
	//InelliJ test
	//finds a sum of all numbers in n divided by div
	public int arSum (int n, int div) {
		int sum = 0; //returned sum
		int firstMem = div;
		int amount = (n-1)/div; //number of members
		
		sum = (2*firstMem + div*(amount-1))*((amount/2)+(amount%2));
		
		return sum;
	}
	
	public int multSum (int div1, int div2, int n) {
		int sum = 0;
		sum = arSum(n, div1) + arSum(n, div2) - arSum(n, div1*div2);
		//add two arithmetic progression with d=div1 and d=div2
		//but extract sum of div1*div2 to avoid duplicates (15 for 3 and 5)
		return sum;
	}
	
	public int testSum (int div1, int div2, int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			if ((i%div1==0) || (i%div2==0)) {
				sum=sum+i;
			//	System.out.println(i);
			}
		}
		//brute-force sum
		return sum;
	}
}
