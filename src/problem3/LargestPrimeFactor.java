package problem3;


public class LargestPrimeFactor {

    private double greatCommonDivider(double a, double b) {
        double rem = 0;
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
        double nSqr = Math.sqrt(n);
        for (int i = 2; i < nSqr; i++) {
            if (n % i == 0)
                check = false;
            else check = true;
        }

        return check;
    }

    public double largestPrime (double n) {
        double factor = 0.0;
        double nSqr = Math.sqrt(n);

        for (int i = 2; i < nSqr; i++) {
            if (isPrime(i) && isPrime(n/i) && (n%i == 0)) {
                factor = n/i;
            }
        }



        return factor;
    }

    //doesn't work
    //Pollard's rho algorithm
//    public double largestPrime (double n) {
//        double primeFixed = 2; //x_fixed
//        int cycleSize = 2;  //cycle_size
//        double prime = 2;      //x
//        double factor = 1;     //factor
//
//        while (factor == 1) {
//            for (int count = 1; ((count <= cycleSize) /*&& (factor <= 1)*/); count++) {
//                prime = (prime*prime + 1) % n;
//                factor = greatCommonDivider(prime - primeFixed, n);
//            }
//
//            cycleSize *= 2;
//            primeFixed = prime;
//            System.out.println(factor);
//        }
//
//        return factor;
//    }
}