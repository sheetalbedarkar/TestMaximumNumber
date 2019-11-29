package com.bridgelabz.generics;

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

    public Double findMaxDouble(Double a, Double b, Double c) {
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

    public String findMaxString(String a, String b, String c) {
        if(a.compareTo(b) > 0) {
            System.out.println("Maximum String is :: "+a);
            return a;
        }
        else if( c.compareTo(b) > 0){
            System.out.println("Maximum String is :: "+c);
            return c;
        }
        else {
            System.out.println("Maximum String is :: "+b);
            return b;
        }
    }
}
