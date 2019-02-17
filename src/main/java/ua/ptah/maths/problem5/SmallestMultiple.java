package ua.ptah.maths.problem5;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.NoSuchElementException;
import java.util.stream.LongStream;

class SmallestMultiple {

  //MOAR STREAMS!!
  static long smallestMultiple(long divRangeLimit) {
    long lowerLimit = LongStream.range(1, divRangeLimit + 1).sum();
    long upperLimit = LongStream.range(1, divRangeLimit).reduce(1, (a, b) -> a * b);

    return LongStream.rangeClosed(lowerLimit, upperLimit)
        .filter(i -> isDivByRange(i, divRangeLimit))
        .findFirst()
        .orElseThrow(NoSuchElementException::new);
  }

  //checks if NUM is divided without a reminder by all numbers in a range (0, MAX_DIV]
  private static boolean isDivByRange(long num, long maxDiv) {
//    return LongStream.iterate(2, i -> i++).limit(maxDiv).allMatch(i -> num % i == 0);

    boolean check = true;

    for (int i = 2; i <= maxDiv; i++) {
      if (num % i != 0) {
        check = false;
        break;
      }
    }

    return check;
  }
}
