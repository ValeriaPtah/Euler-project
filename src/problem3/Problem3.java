package problem3;

//The prime factors of 13 195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600 851 475 143 ?


public class Problem3 {
    public static void main(String[] args) {
        double n = 13195.0; //issue with too large number
        double y = 600851475143.0;
        LargestPrimeFactor euler3 = new LargestPrimeFactor();

        System.out.println("Final result: " + euler3.largestPrime(n));
    }
}
