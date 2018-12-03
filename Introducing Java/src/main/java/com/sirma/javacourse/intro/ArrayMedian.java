package com.sirma.javacourse.intro;

public class ArrayMedian {
    public static int getMedianIndex(int[] array) {
        long[] diffOfSumsByMedian = new long[array.length]; // this array holds the differences of the sums before and
        //after the current index from the given array parameter
        for (int i = 0; i < array.length; i++) {
            long sumBeforeMedian = 0;
            long sumAfterMedian = 0;
            for (int j = 0; j < i; j++) {
                sumBeforeMedian += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumAfterMedian += array[j];
            }
            diffOfSumsByMedian[i] = Math.abs(sumBeforeMedian - sumAfterMedian);
        }
        int medianIndex = 0;
        long medianValue = Long.MAX_VALUE;
        for (int i = 0; i < diffOfSumsByMedian.length; i++) {
            if (diffOfSumsByMedian[i] < medianValue) {
                medianValue = diffOfSumsByMedian[i];
                medianIndex = i;
            }
        }
        ArrayProcessing.print(diffOfSumsByMedian);
        System.out.println(medianIndex + 1); // here the counting starts from 1, not from 0
        return medianIndex + 1; // here the counting starts from 1, not from 0
    }
}
