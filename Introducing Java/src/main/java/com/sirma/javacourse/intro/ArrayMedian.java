package com.sirma.javacourse.intro;

public class ArrayMedian {

    //returns the index of the median when counting form 1, NOT 0!!! if the array is empty return -1;
    public static int getMedianIndex(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        return getMedianIndexSubArray(array, 0, array.length - 1);
    }

    //returns the index of the median of subarray by given start and end indexes
    public static int getMedianIndexSubArray(int[] array, int startIndex, int endIndex) {
        //this array holds the differences of the sums before and
        //after the current index from the given array parameter
        long[] diffOfSumsByMedian = new long[endIndex - startIndex + 1];
        for (int i = startIndex; i < endIndex + 1; i++) {
            long sumBeforeMedian = 0;
            long sumAfterMedian = 0;
            for (int j = startIndex; j < i; j++) {
                sumBeforeMedian += array[j];
            }
            for (int j = i + 1; j < endIndex + 1; j++) {
                sumAfterMedian += array[j];
            }
            diffOfSumsByMedian[i - startIndex] = Math.abs(sumBeforeMedian - sumAfterMedian);
        }
        int medianIndex = 0;
        long medianDiffValue = Long.MAX_VALUE;
        for (int i = 0; i < diffOfSumsByMedian.length; i++) {
            if (diffOfSumsByMedian[i] < medianDiffValue) {
                medianDiffValue = diffOfSumsByMedian[i];
                medianIndex = i;
            }
        }
        return medianIndex + startIndex + 1; // here the counting starts from 1, not from 0
    }
}
