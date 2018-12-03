package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDivisorTest {

    @Test
    public void TestsFindGCD() {
        int gcd = GreatestCommonDivisor.findGCD(5, 10);
        Assert.assertEquals(5, gcd);
    }
    @Test
    public void TestsFindGCD1() {
        int gcd = GreatestCommonDivisor.findGCD(5, 10);
        Assert.assertEquals(5, gcd);
    }

    @Test
    public void TestsFindGCD_2() {
        int gcd = GreatestCommonDivisor.findGCD(1207, 5642);
        Assert.assertEquals(1, gcd);
    }

    @Test
    public void TestsFindGCD_Zeroes1() {
        int gcd = GreatestCommonDivisor.findGCD(0, 0);
        Assert.assertEquals(0, gcd);
    }

    @Test
    public void TestsFindGCD_Zeroes2() {
        int gcd = GreatestCommonDivisor.findGCD(0, 10);
        Exception exception = new java.lang.ArithmeticException();
        Assert.assertEquals(exception, gcd);
    }
    @Test
    public void TestsFindGCD_Zeroes3() {
        int gcd = GreatestCommonDivisor.findGCD(120, 0);
        Assert.assertEquals(0, gcd);
    }

    @Test
    public void TestsFindLCM() {
        int lcm = GreatestCommonDivisor.findLCM(20, 1112);
        Assert.assertEquals(5560, lcm);

        int lcmZeroes = GreatestCommonDivisor.findLCM(1, 1);
        Assert.assertEquals(1, lcmZeroes);
    }
}