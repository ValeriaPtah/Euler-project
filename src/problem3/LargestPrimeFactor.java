package problem3;


public class LargestPrimeFactor {
//
//    private double greatCommonDivider(double a, double b) {
//        double rem;
//        while (b != 0) {
//            rem = a%b;
//            a = b;
//            b = rem;
//        }
//
//        return a;
//    }

    //check if a number is prime
    private boolean isPrime (double n) {
        boolean check = false;
        int cutN = (int)n; //cutting *.[00] part
        for (int i = 2; i <= cutN/2; i++) {
            if (cutN % i == 0) {
                check = false;
                break;
            }
            else check = true;
        }

        return check;
    }

    public double largestPrime (double n) {
        double factor = 0.0;
        double nHalf = n/2;
        double nSqr = Math.sqrt(n);
        System.out.println("nSqr: " + nSqr + "\n"); //debug

//        for (int i = 2; i <= nHalf; i++) {
        for (int i = 2; i < nSqr; i++) {
            System.out.println("Step: " + i); //debug
            if (isPrime(i) && (n%i == 0)) {
                factor = i;
//                System.out.println("Factor: " + factor + "\n"); //debug
            }
        }


        return factor;
    }

}