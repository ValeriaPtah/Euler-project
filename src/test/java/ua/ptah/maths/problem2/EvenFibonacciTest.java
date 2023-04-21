package ua.ptah.maths.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.ptah.maths.problem2.EvenFibonacci.sumEvenFibonacciBelowLimit;

class EvenFibonacciTest {

    @Test
    void sumEvenFibonacciBelowLimitTest() {
        assertEquals(4613732, sumEvenFibonacciBelowLimit(4000000));
    }

}