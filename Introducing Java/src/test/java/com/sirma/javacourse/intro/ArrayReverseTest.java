package com.sirma.javacourse.intro;

import org.junit.Assert;
import org.junit.Test;

public class ArrayReverseTest {

    @Test
    public void testsArrayReverse() {
        var array = new int[]{5, 9, 33, 47, 9, -5, 8, -63, 546, 8, 2, 1, -1, 65848, -38489,
                2, 8, 6, 3, 4, -52894, 9, -0, 99, -1568, 1};
        var reversedArray = new int[]{1, -1568, 99, 0, 9, -52894, 4, 3, 6, 8, 2,
                -38489, 65848, -1, 1, 2, 8, 546, -63, 8, -5, 9, 47, 33, 9, 5};
        ArrayReverse.arrayReverse(array);
        for (int i = 0; i < array.length; i++) {
            Assert.assertEquals(reversedArray[i], array[i]);
        }
    }
}