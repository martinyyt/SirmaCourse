package com.sirma.javacourse.intro;

import static com.sirma.javacourse.intro.ArrayMedian.getMedianIndex;
import static com.sirma.javacourse.intro.ArrayProcessing.*;
import static com.sirma.javacourse.intro.GreatestCommonDivisor.*;

public class Run {
    public static void main(String[] args) {
        System.out.println(findGCD(10, 1112));
        System.out.println(findLCM(20, 1112));
        System.out.println(getMinElementIndex(new int[]{-55, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100}));
        System.out.println(sum(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100}));
        print(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100});
        findMaxSumOfConsecutiveElements(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, -100});
        findMaxSumOfConsecutiveElements(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        getMedianIndex(new int[]{1, 2, 3, 4, 5});
        getMedianIndex(new int[]{4, 5, 99, -1, 5, 6});
        getMedianIndex(new int[]{1});
    }
}
