package problem3;

//The prime factors of 13 195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600 851 475 143 ?


public class Problem3 {
    public static void main(String[] args) {
        int n = 13195; //issue with too large number
        LargestPrimeFactor euler3 = new LargestPrimeFactor();

        System.out.println(euler3.largestPrime(n));
    }
}
