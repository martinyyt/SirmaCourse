package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMedianTest {

    @Test
    public void getMedianIndex() {
        int result = ArrayMedian.getMedianIndex(new int[]{4, 5, 99, -1, 5, 6});
        Assert.assertEquals(3, result);
    }
}