package ua.ptah.maths.problem5;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?


public class Problem5 {

  public static void main(String[] args) {
    int n = 20;

    SmallestMultiple euler5 = new SmallestMultiple();

    System.out.println("Check:" + euler5.toString(n));


  }
}
