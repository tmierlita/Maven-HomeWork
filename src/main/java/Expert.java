public class Expert extends Basic {

//    public Expert(int floatingPoint) {
//        super(floatingPoint);
//    }

    public int pow(int baza, int putere){
        int pow = baza;
           if (putere==0){
               pow = 1;
           }
           else {
               for (int i = 1; i < putere; i++) {
                   pow *= baza;
               }
           }
        return pow;
    }

    public long pow(long baza, long putere){
        long pow = baza;
        if (putere==0){
            pow = 1;
        }
        else {
            for (int i = 1; i < putere; i++) {
                pow *= baza;
            }
        }

        return pow;
    }

    public int sqrt(int radical, int sqrtbaza){
        int sqrt = 1;
        while(java.lang.Math.pow(sqrt,sqrtbaza)<radical){
            sqrt++;
        }
        return sqrt;
    }

    public int factorial(int termen){
           int factorial=termen;
           for (int i=1; i<termen; i++){
               factorial = factorial *(0+i);
           }
           return factorial;
    }


}
