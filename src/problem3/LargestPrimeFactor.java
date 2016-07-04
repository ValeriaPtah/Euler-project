package problem3;


public class LargestPrimeFactor {

    //check if a number is prime
    private boolean isPrime (long n) {
        boolean check = false;
//        int cutN = (int)n; //cutting *.[00] part
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
            else check = true;
        }

        return check;
    }

    public double largestPrime (long n) {
        double factor = 0.0;
        double nHalf = n/2;
        double nSqr = Math.sqrt(n+1);
        System.out.println("nSqr: " + nSqr + "\n"); //debug

//        for (int i = 2; i <= nHalf; i++) {
        for (int i = 3; i <= nSqr; i+=2) {
//            System.out.println("Step: " + i); //debug
            if (isPrime(i) && (n%i == 0)) {
                factor = i;
//                System.out.println("Factor: " + factor + "\n"); //debug
            }
        }


        return factor;
    }

    public long largestPrimeCheck (long n) {
        long remN = n;
        long lastFactor = 0L;
        long factor = 0L;
        if (remN%2 == 0) {
            lastFactor = 2L;
            remN = remN/2;
            while (remN%2 == 0)
                remN = remN/2;
        } else {
            lastFactor = 3L;
        }
        factor = 3L;
        long maxFactor = remN;
        while (remN>1 && factor <= maxFactor) {
            System.out.println("I'm in a 'while (remN>1 && factor <= maxFactor)'!");
            if (remN%factor == 0) {
                remN = remN/factor;
                lastFactor = factor;
                while (remN%factor == 0)
                    remN = remN/factor;
                maxFactor = remN^(1/2);//Math.sqrt(remN);
                factor += 2;
            }
        }

        if (remN == 1)
            return lastFactor;
        else return remN;
    }

}