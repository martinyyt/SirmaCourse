package com.sirma.javacourse.intro;

public class ArraySorting {
    public static int[] quickSort(int[] array) {
        return quickSort(array, 0, array.length);
    }

    //should I choose the median as pivot?
    private static int[] quickSort(int[] array, int startIndex, int endIndex) {
        int[] sortedArray = new int[array.length];
        int medianIndex = ArrayMedian.getMedianIndex(array);
        for (int i = 0; i<medianIndex;i++){

        }

        if (medianIndex > 0) {
            quickSort(array, 0, medianIndex);
        }
        if (medianIndex < array.length) {
            quickSort(array, medianIndex + 1, array.length);
        }
        //remove this
        return new int[]{0};
    }
}
