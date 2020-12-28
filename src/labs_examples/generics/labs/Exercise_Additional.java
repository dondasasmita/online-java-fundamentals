package labs_examples.generics.labs;
/**
 * 1. Make the method generic and bound it to "extends Comparable<T>"
 * 2. Replace the int types for the generic T
 * 3. Change the comparisons ">" for "value1.compareTo(value2)""
 */

public class Exercise_Additional {

    public static <T extends  Number, A extends  Number, B extends Number> int getMax(T x, A y, B z) {
        int max = x.intValue();   // assume x is initially the largest

        if(y.intValue() > max) {
            max = y.intValue();   // y is the largest so far
        }

        if(z.intValue() > y.intValue()) {
            max = z.intValue();   // z is the largest now
        }
        return max;   // returns the largest object
    }

    public static void main(String[] args) {
        System.out.println(getMax(10, 20.20, 100.98123));
    }

}
