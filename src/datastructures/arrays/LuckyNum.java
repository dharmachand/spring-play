package datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class LuckyNum {
    /*
    A happy number is a number defined by the following process: Starting with any positive integer,
    replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
    (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy numbers.
    */

    public static boolean isHappy(int n) {
        int sum;
        Set<Integer> loopNum = new HashSet<>();
        while (loopNum.add(n)) {
            sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        // 19 : true, 2 : false, 7 : true
        System.out.println(isHappy(2));
    }
}
