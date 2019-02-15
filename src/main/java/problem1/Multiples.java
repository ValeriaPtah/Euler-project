package problem1;


public class Multiples {

  /**
   * finds a sum of all numbers below the LIMIT divided by DIV
   * DIV is also a first member of a progression
   */
  private static int sumOfArithmeticProgression(int div, int limit) {
    int amountOfMembers = (limit - 1) / div;
    int lastMember = div + (div * (amountOfMembers - 1));

    return amountOfMembers * (div + lastMember) / 2;
  }

  /**
   * add two arithmetic progression with d = div1 and d = div2
   * but extract sum of (div1 * div2) to avoid duplicates (15 for 3 and 5)
   */
  public static int sumOfMultiples(int div1, int div2, int limit) {

    return sumOfArithmeticProgression(div1, limit) + sumOfArithmeticProgression(div2, limit)
        - sumOfArithmeticProgression(div1 * div2, limit);
  }
}
