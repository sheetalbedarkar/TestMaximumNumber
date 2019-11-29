package com.bridgelabz.generics;

import java.util.Arrays;

public class FindMaxNumber {

    public Integer findMaxInteger(Integer a, Integer b, Integer c) {
        if(a.compareTo(b) > 0) {
            System.out.println("Maximum Number is :: "+a);
            return a;
        }
        else if( c.compareTo(b) > 0){
            System.out.println("Maximum Number is :: "+c);
            return c;
        }
        else {
            System.out.println("Maximum Number is :: "+b);
            return b;
        }
    }
}
