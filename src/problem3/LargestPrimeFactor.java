package problem3;


public class LargestPrimeFactor {

    private int greatCommonDivider(int a, int b) {
        int rem = 0;
        while (b != 0) {
            rem = a%b;
            a = b;
            b = rem;
        }

        return a;
    }

    //doesn't work
    //Pollard's rho algorithm
    public int largestPrime (int n) {
        int primeFixed = 2; //x_fixed
        int cycleSize = 2;  //cycle_size
        int prime = 2;      //x
        int factor = 1;     //factor

        while (factor == 1) {
            for (int count = 1; ((count <= cycleSize) && (factor <= 1)); count++) {
                prime = (prime*prime + 1) % n;
                factor = greatCommonDivider(prime - primeFixed, n);
            }

            cycleSize *= 2;
            primeFixed = prime;
            System.out.println(factor);
        }

        return factor;
    }
}