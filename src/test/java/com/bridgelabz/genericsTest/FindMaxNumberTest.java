package com.bridgelabz.genericsTest;

import com.bridgelabz.generics.FindMaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumberTest {

    @Test
    public void givenThreeInput_WhenMaximumNumber_shouldReturnTrue() {
        Integer a = 10;
        Integer b = 7;
        Integer c = 8;
        FindMaxNumber findMaxNum = new  FindMaxNumber();
        Integer maxNum = findMaxNum.findMaxInteger(a,b,c);
        Assert.assertEquals((Integer)10,maxNum);
        }
}
