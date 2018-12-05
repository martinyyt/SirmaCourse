package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMedianTest {

    @Test
    public void testsGetMedianIndex() {
        int result = ArrayMedian.getMedianIndex(new int[]{4, 5, 99, -1, 5, 6});
        Assert.assertEquals(3, result);
    }

    @Test
    public void testsGetMedianIndex2() {
        int result = ArrayMedian.getMedianIndex(new int[]{10, 5, 0, -1, -5, -6});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testsGetMedianIndex_EmptyArray() {
        int result = ArrayMedian.getMedianIndex(new int[]{});
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testsGetMedianIndex_OneElement() {
        int result = ArrayMedian.getMedianIndex(new int[]{0});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testsGetMedianIndex_TwoEqualElements() {
        int result = ArrayMedian.getMedianIndex(new int[]{10, 10});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testsGetMedianIndex_TwoElements() {
        int result = ArrayMedian.getMedianIndex(new int[]{100, -25});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testsGetMedianIndex_TwoElementsWithZero() {
        int result = ArrayMedian.getMedianIndex(new int[]{0, -25});
        Assert.assertEquals(2, result);
    }

    @Test
    public void testsGetMedianIndex_OnlyZeroes() {
        int result = ArrayMedian.getMedianIndex(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,});
        Assert.assertEquals(1, result);
    }

    @Test
    public void testsGetMedianIndexSubArray() {
        int result = ArrayMedian.getMedianIndexSubArray(new int[]{4, 5, 99, -1, 5, 6}, 1, 4);
        Assert.assertEquals(3, result);
    }
}