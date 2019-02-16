package ua.ptah.maths.problem5;

import static ua.ptah.maths.problem5.SmallestMultiple.smallestMultiple;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Problem5 {

  public static void main(String[] args) {
    System.out.println("The Smallest Multiple for " + 20 + " is: " + smallestMultiple(20));
  }
}