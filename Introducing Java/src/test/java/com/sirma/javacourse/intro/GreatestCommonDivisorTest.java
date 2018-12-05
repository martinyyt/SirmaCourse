package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

public class GreatestCommonDivisorTest {

    @Test
    public void testsFindGCD_LargeNumbers() {
        int gcd = GreatestCommonDivisor.findGCD(2896544, 568128);
        Assert.assertEquals(32, gcd);
    }

    @Test
    public void testsFindGCD_ExpectOne() {
        int gcd = GreatestCommonDivisor.findGCD(1207, 5642);
        Assert.assertEquals(1, gcd);
    }

    @Test(expected = ArithmeticException.class)
    public void testsFindGCD_Zeroes() {
        GreatestCommonDivisor.findGCD(0, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testsFindGCD_FirstParamZero() {
        GreatestCommonDivisor.findGCD(0, 10);
    }

    @Test(expected = ArithmeticException.class)
    public void testsFindGCD_SecondParamZero() {
        GreatestCommonDivisor.findGCD(120, 0);
    }

    @Test
    public void testsFindLCM() {
        int lcm = GreatestCommonDivisor.findLCM(20, 1112);
        Assert.assertEquals(5560, lcm);

        int lcmOne = GreatestCommonDivisor.findLCM(1, 1);
        Assert.assertEquals(1, lcmOne);
    }

    @Test(expected = ArithmeticException.class)
    public void testsFindLCM_Zeroes() {
        GreatestCommonDivisor.findLCM(0, 0);
    }
}