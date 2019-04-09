package ua.ptah.maths.problem5;

/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

import java.util.NoSuchElementException;
import java.util.stream.LongStream;

class SmallestMultiple {

  static long smallestMultiple(long maxDivisor) {
    long upperLimit = LongStream.rangeClosed(1, maxDivisor).reduce(1, (a, b) -> a * b);

    return LongStream.rangeClosed(1, upperLimit)
        .filter(i -> isDivByRange(i, maxDivisor))
        .findFirst()
        .orElseThrow(NoSuchElementException::new);
  }

  private static boolean isDivByRange(long num, long maxDivisor) {
    return LongStream.rangeClosed(2, maxDivisor).allMatch(i -> num % i == 0);
  }
}
