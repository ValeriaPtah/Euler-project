package ua.ptah.maths.problem3;

import static ua.ptah.maths.problem3.LargestPrimeFactor.largestPrimeFactor;

/*
 * The prime factors of 13 195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600 851 475 143 ?
 */

public class Problem3 {

  public static void main(String[] args) {
    System.out.println("Final: " + largestPrimeFactor(600851475143L));
  }
}
