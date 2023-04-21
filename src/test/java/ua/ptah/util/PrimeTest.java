package ua.ptah.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {

    @Test
    void isPrimeTest() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(37));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(-2));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(10));
    }
}