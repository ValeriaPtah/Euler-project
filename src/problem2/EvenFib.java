package problem2;


public class EvenFib {


    public int fibSum (int n) {
        int sum = 0;


        return sum;
    }

    //brute-force check
    public int testSum(int n) {
        int sum = 0;

        int fibPrev = 1;
        int fibCur = 2;
        int fibNext = 0;
        
        while (fibNext <= n) {
            //Fibonacci iteration
            fibNext = fibPrev + fibCur;
            fibPrev = fibCur;
            fibCur = fibNext;
            if (fibNext%2 == 0) //calculating the sum
                sum+=fibNext;
        }

        return sum;
    }

}
