package ua.ptah.maths.problem1;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem1 {

  private static final int MULTIPLIER1 = 3, MULTIPLIER2 = 5, LIMIT = 1000;

  public static void main(String[] args) {
    System.out.println("Final: " + Multiples.sumOfMultiples(MULTIPLIER1, MULTIPLIER2, LIMIT));
  }

}
