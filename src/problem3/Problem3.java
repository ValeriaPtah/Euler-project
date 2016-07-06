package problem3;

//	The prime factors of 13 195 are 5, 7, 13 and 29.
//	What is the largest prime factor of the number 600 851 475 143 ?


public class Problem3 {
    public static void main(String[] args) {
        long n1 = 8051L;
        long n2 = 10403L;
        long y = 600851475143L;
        
        LargestPrimeFactor euler3 = new LargestPrimeFactor();

        System.out.println("(should be 97) Test result: " + euler3.largestPrimeCheck(n1));
        System.out.println("(should be 103) Test result: " + euler3.largestPrimeCheck(n2));
        System.out.println("Final result: " + euler3.largestPrimeCheck(y));
    }
}
