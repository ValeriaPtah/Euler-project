package problem3;


public class LargestPrimeFactor {

    int greatCommonDiviser (int a, int b) {
        int rem = 0;
        while (b != 0) {
            rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }

    //doesn't work
    public int largestPrime (int n) {
        int primeFixed = 2;
        int cycleSize = 2;
        int prime = 2;
        int factor = 1;

        while (factor == 1) {
            for (int count=1; (count <= cycleSize) && (factor <= 1); count++) {
                prime = (prime^2+1)%n;
                factor = greatCommonDiviser(prime - primeFixed, n);
            }

            cycleSize *= 2;
            primeFixed = prime;
        }

        return factor;
    }
}
