package com.hexq.nms.test;

/**
 * @author hexq
 * @date 2018/6/5 17:51
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(factorial(20L));
    }

    public static long factorial(long i) {
        if (i <= 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }
}
