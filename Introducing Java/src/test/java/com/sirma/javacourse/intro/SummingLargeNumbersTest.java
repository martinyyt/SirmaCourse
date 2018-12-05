package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SummingLargeNumbersTest {

    @Test
    public void testsSumLargeNumbers() {
        String numbOne = "1683565468";
        String numbTwo = "489666516546";
        String sum = SummingLargeNumbers.sumLargeNumbers(numbOne, numbTwo);
        String expectedSum = "491350082014";
        Assert.assertEquals(expectedSum, sum);
    }
    @Test
    public void testsSumLargeNumbers_Zeroes() {
        String numbOne = "0";
        String numbTwo = "0";
        String sum = SummingLargeNumbers.sumLargeNumbers(numbOne, numbTwo);
        String expectedSum = "0";
        Assert.assertEquals(expectedSum, sum);
    }
    @Test
    public void testsSumLargeNumbers_EmtyStrings() {
        String numbOne = "";
        String numbTwo = "";
        String sum = SummingLargeNumbers.sumLargeNumbers(numbOne, numbTwo);
        String expectedSum = "0";
        Assert.assertEquals(expectedSum, sum);
    }
}