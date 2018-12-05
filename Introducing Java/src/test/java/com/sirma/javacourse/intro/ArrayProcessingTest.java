package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayProcessingTest {

    @Test
    public void testsGetMinElementIndex() {
        int[] array = new int[]{0, -5, 5, -9, 8, 125, 8, -15852, 5};
        int index = ArrayProcessing.getMinElementIndex(array);
        Assert.assertEquals(7, index);
    }

    @Test
    public void testsGetMinElementIndex_EmptyArray() {
        int[] array = new int[]{};
        int index = ArrayProcessing.getMinElementIndex(array);
        Assert.assertEquals(-1, index);
    }

    @Test
    public void testsGetMinElementIndex_OneElement() {
        int[] array = new int[]{0};
        int index = ArrayProcessing.getMinElementIndex(array);
        Assert.assertEquals(0, index);
    }

    @Test
    public void testsSum() {
        int[] array = new int[]{0, -5, 5, -9, 8, 125, 8, -15852, 5};
        var sum = ArrayProcessing.sum(array);
        Assert.assertEquals(-15715, sum);
    }

    @Test
    public void testsSum_EmptyArray() {
        int[] array = new int[]{};
        var sum = ArrayProcessing.sum(array);
        Assert.assertEquals(0, sum);
    }

    @Test
    public void testsFindMaxSumOfConsecutiveElements() {
        int[] array = new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, -100};
        long sum = ArrayProcessing.findMaxSumOfConsecutiveElements(array);
        Assert.assertEquals(36, sum);

        array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        sum = ArrayProcessing.findMaxSumOfConsecutiveElements(array);
        Assert.assertEquals(6, sum);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testsFindMaxSumOfConsecutiveElements_EmptyArray() {
        int[] array = new int[]{};
        long sum = ArrayProcessing.findMaxSumOfConsecutiveElements(array);
        Assert.assertEquals(0, sum);
    }
}