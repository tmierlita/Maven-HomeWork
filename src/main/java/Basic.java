public class Basic {

//    int floatingPoint;
//
//    public Basic(int floatingPoint) {
//        this.floatingPoint = floatingPoint;
//    }

    public int add(int... termen1){
        int sum = 0;
        for (int i = 0; i<termen1.length; i++){
            sum = sum + termen1[i];
        }
        return sum;
    }

    public long add(long... termen1){
        long sum = 0;
        for (int i = 0; i<termen1.length; i++){
            sum = sum + termen1[i];
        }
        return sum;
    }

    public double add(double... termen1){
        double sum = 0;
        for (int i = 0; i<termen1.length; i++){
            sum = sum + termen1[i];
        }
        return sum;
    }

    public int substract(int... termen1){
        int substract = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            substract = substract - termen1[i];
        }
        return substract;
    }

    public long substract(long... termen1){
        long substract = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            substract = substract - termen1[i];
        }
        return substract;
    }

    public double substract(double... termen1){
        double substract = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            substract = substract - termen1[i];
        }
        return substract;
    }

    public int multiply(int... termen1){
        int multiply = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            multiply = multiply * termen1[i];
        }
        return multiply;
    }

    public long multiply(long... termen1){
            long multiply = termen1[0];
            for (int i = 1; i<termen1.length; i++){
                multiply = multiply * termen1[i];
            }
            return multiply;
    }

    public double multiply(double... termen1){
        double multiply = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            multiply = multiply * termen1[i];
        }
        return multiply;
    }

    public double divide(int... termen1){
        double divide = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            divide = divide / termen1[i];
        }
        return divide;
    }

    public double divide(long... termen1){
        double divide = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            divide = divide / termen1[i];
        }
        return divide;

    }

    public double divide(double... termen1){
        double divide = termen1[0];
        for (int i = 1; i<termen1.length; i++){
            divide = divide / termen1[i];
        }
        return divide;

    }
}

