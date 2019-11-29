package com.bridgelabz.genericsTest;

import com.bridgelabz.generics.FindMaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenThreeIntegerInput_WhenMaximumNumber_onFirstPosition_shouldReturnTrue() {
        Integer a = 10;
        Integer b = 7;
        Integer c = 8;
        FindMaxNumber<Integer> findMaxNum = new  FindMaxNumber<>(a, b, c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Integer)10,maxNum);
    }

    @Test
    public void givenThreeIntegerInput_whenMaxNumber_onSecondPosition_shouldReturnTrue() {
        Integer a = 1;
        Integer b = 8;
        Integer c = 4;
        FindMaxNumber<Integer> findMaxNum = new  FindMaxNumber<>(a, b, c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Integer)8,maxNum);
    }

    @Test
    public void givenThreeIntegerInput_WhenMaximumNumber_onThirdPosition_shouldReturnTrue() {
        Integer a = 5;
        Integer b = 7;
        Integer c = 9;
        FindMaxNumber<Integer> findMaxNum = new  FindMaxNumber<>(a, b, c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Integer)9,maxNum);
    }

    @Test
    public void givenThreeDoubleInput_WhenMaximumNumber_onFirstPosition_shouldReturnTrue() {
        Double a = 10.5;
        Double b = 7.1;
        Double c = 8.9;
        FindMaxNumber<Double> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Double) 10.5,maxNum);
    }

    @Test
    public void givenThreeDoubleInput_whenMaxNumber_onSecondPosition_shouldReturnTrue() {
        Double a = 1.9;
        Double b = 8.3;
        Double c = 4.7;
        FindMaxNumber<Double> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Double)8.3,maxNum);
    }

    @Test
    public void givenThreeDoubleInput_WhenMaximumNumber_onThirdPosition_shouldReturnTrue() {
        Double a = 5.2;
        Double b = 7.8;
        Double c = 9.9;
        FindMaxNumber<Double> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((Double)9.9,maxNum);
    }

    @Test
    public void givenThreeStringInput_WhenMaximumString_onFirstPosition_shouldReturnTrue() {
        String a = "peach";
        String b = "apple";
        String c = "banana";
        FindMaxNumber<String> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((String) "peach",maxNum);
    }

    @Test
    public void givenThreeStringInput_whenMaxString_onSecondPosition_shouldReturnTrue() {
        String a = "apple";
        String b = "peach";
        String c = "banana";
        FindMaxNumber<String> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((String) "peach",maxNum);
    }

    @Test
    public void givenThreeStringInput_WhenMaximumString_onThirdPosition_shouldReturnTrue() {
        String a = "apple";
        String b = "banana";
        String c = "peach";
        FindMaxNumber<String> findMaxNum = new  FindMaxNumber(a,b,c);
        Comparable maxNum = findMaxNum.findMaxValue();
        Assert.assertEquals((String) "peach",maxNum);
    }
}
