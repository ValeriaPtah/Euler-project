package ua.ptah.maths.problem4;

/*
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

class PalindromeFromThreeDigits {

  //brute-force check
  int biggestPalindromeFromThreeDigits() {
    int palindrome = 0;
    int product;

    //the sequence is semi-right
    for (int i = 999; i >= 100; i--) {
      for (int j = 999; j >= i; j--) {
        product = i * j;
        if ((product) > 100000) {
          if (isPalindrome(product) && (product > palindrome)) {
            palindrome = product;
            break;
          }
        }
      }
    }

    return palindrome;
  }

  private boolean isPalindrome(int n) {
    int[] segregated = new int[6];

    segregated[0] = n / 100000;
    segregated[1] = n / 10000 % 10;
    segregated[2] = n / 1000 % 10;
    segregated[3] = n / 100 % 10;
    segregated[4] = n / 10 % 10;
    segregated[5] = n % 10;

    return (segregated[0] == segregated[5]) && (segregated[1] == segregated[4]) && (segregated[2] == segregated[3]);
  }

}
