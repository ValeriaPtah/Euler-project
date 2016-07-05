package problem3;


public class LargestPrimeFactor {

    //checks if a number is prime
    private boolean isPrime (long n) {
        boolean check = false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
            else check = true;
        }

        return check;
    }


    //searches the largest prime divider (factor)
    public long largestPrimeCheck (long n) {
        long nLoc = n;
        long lastFactor = 0L;
        double maxFactor = Math.sqrt(nLoc);
        long factor = 3L;

        if (nLoc%2 == 0) {
            lastFactor = 2L;
            nLoc = nLoc/2;
            while (nLoc%2 == 0)
                nLoc = nLoc/2;

        } else {
            lastFactor = 1;
        }

        while ((nLoc > 1) && (factor <= maxFactor)) {
            if (n%factor == 0) {
                nLoc = nLoc/factor;
                lastFactor = factor;
                while (nLoc%factor == 0)
                    nLoc = nLoc/factor;
            }
            factor += 2;
        }

        if (nLoc == 1) {
            return lastFactor;
        } else return nLoc;
    }

}