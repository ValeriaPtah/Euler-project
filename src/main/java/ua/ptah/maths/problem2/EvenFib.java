package ua.ptah.maths.problem2;


class EvenFib {

  private int fibNext;
  private int fibCur;
  private int fibPrev;


  //optimised method
  int fibSum(int n) {
    int sum;

    this.fibPrev = 2;
    this.fibCur = 8;
    this.fibNext = 0;

    sum = this.fibPrev + this.fibCur;

    while (fibNext <= n) {
      sum += fibNext;
      //counting only every third fibonacci term
      fibNext = 4 * fibCur + fibPrev;
      fibPrev = fibCur;
      fibCur = fibNext;

    }

    return sum;
  }

  //brute-force check
  int testSum(int n) {
    int sum = 0;

    this.fibPrev = 1;
    this.fibCur = 1;
    this.fibNext = 0;

    while (fibNext <= n) {
      if (fibNext % 2 == 0) //calculating the sum
      {
        sum += fibNext;
      }
      //usual Fibonacci iteration
      fibNext = fibPrev + fibCur;
      fibPrev = fibCur;
      fibCur = fibNext;
    }

    return sum;
  }

}
