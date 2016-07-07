package problem4;


import java.util.Arrays;

public class PalindromeTriple {

    private int[] segregated = new int[6];
    private int firstMult, secondMult;

    //the biggest product of two 3-digit numbers is 998 001 = 999 * 999
    //the smallest product of two 3-digit numbers is 100 000 = 100 * 100

    private boolean isPalindrome (int n) {
        boolean check = false;

        //creating an array from an integer
        segregated[0] = n / 100000;
        segregated[1] = n / 10000 % 10;
        segregated[2] = n / 1000 % 10;
        segregated[3] = n / 100 % 10;
        segregated[4] = n / 10 % 10;
        segregated[5] = n % 10;
//        System.out.println(Arrays.toString(segregated));

        if ((segregated[0] == segregated[5]) && (segregated[1] == segregated[4]) && (segregated[2] == segregated[3]))
            check = true;
//        System.out.print(check);

        return check;
    }


    //brute-force check
    public int biggestPalindromeTripleTest() {
        int palindrome = 0;
        int product = 0;

        //the sequence is semi-right
        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= i; j--) {
                product = i * j;
                if ((product) > 100000) {
                    if (isPalindrome(product) && (product > palindrome)) {
                        palindrome = product;
//                        System.out.println("Current: " + palindrome + ". i: " + i + ", j :" + (j));
                        firstMult = i;
                        secondMult = j;
                        break;
                    }
                }
            }
        }

        return palindrome;

    }

    public void checkArr() {
        for (int i = 698896; i <= 997799; i++) {
            if (isPalindrome(i))
                System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "The largest palindrome made from the product of two 3-digit numbers is: " + biggestPalindromeTripleTest() + ". i: " + firstMult + ". j :" + secondMult;
    }

}
