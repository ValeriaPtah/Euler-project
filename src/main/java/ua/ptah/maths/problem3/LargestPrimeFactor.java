package ua.ptah.maths.problem3;

/*
 * The prime factors of 13 195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600 851 475 143 ?
 */

class LargestPrimeFactor {

    static long largestPrimeFactor(long n) {
        long nLoc = n;
        long factor = 3L;
        long lastFactor;
        double maxFactor = Math.sqrt(nLoc);

        if (nLoc % 2 == 0) {
            lastFactor = 2L;
            nLoc = nLoc / 2;
            while (nLoc % 2 == 0) {
                nLoc = nLoc / 2;
            }
        } else {
            lastFactor = 1;
        }

        while ((nLoc > 1) && (factor <= maxFactor)) {
            if (n % factor == 0) {
                nLoc = nLoc / factor;
                lastFactor = factor;
                while (nLoc % factor == 0) {
                    nLoc = nLoc / factor;
                }
            }
            factor += 2;
        }

        if (nLoc == 1) {
            return lastFactor;
        } else {
            return nLoc;
        }
    }
}