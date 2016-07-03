package problem3;


public class LargestPrimeFactor {

    private double greatCommonDivider(double a, double b) {
        double rem;
        while (b != 0) {
            rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }

    //check if a number is prime
    private boolean isPrime (double n) {
        boolean check = false;
        int cutN = (int)n; //cutting *.[00] part
//        System.out.println("cutN " + cutN); //debug
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
        double nSqr = Math.sqrt(n);
//        System.out.println("\nnSqr " + nSqr + "\n"); //debug

        for (int i = 2; i <= nSqr; i++) {
            double initDiv = n/i;
//            System.out.println("I'm here! i: " + i); //debug
//            System.out.println("n/i: " + initDiv); //debug
//            System.out.println("Prime? : " + isPrime(initDiv) + "\n"); //debug

            if (isPrime(i) && (n%i == 0)) {
//                System.out.println("I'm finally here... i: " + i); //debug
                factor = i;
//                System.out.println("factor: " + factor);
            }
        }
//        ifPrime() check – works
//        System.out.println("5 is prime: " + isPrime(5));
//        System.out.println("25 is prime: " + isPrime(25));
//        System.out.println("13 is prime: " + isPrime(13));

        return factor;
    }

}