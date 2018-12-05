package com.sirma.javacourse.intro;

public class ArraySorting {

    public static void quickSort(int[] array) {
        quickSortSubArray(array, 0, array.length - 1);
    }

    private static void quickSortSubArray(int[] array, int startIndex, int endIndex) {
        int pivot = partitionSubArray(array, startIndex, endIndex);
        if (pivot == -1) {
            return;
        }
        quickSortSubArray(array, startIndex, pivot - 1);
        quickSortSubArray(array, pivot + 1, endIndex);
    }

    //I choose the median as pivot
    private static int partitionSubArray(int[] array, int startIndex, int endIndex) {
        if (endIndex - startIndex < 1) {
            return -1;
        }
        int[] partitionedArray = new int[array.length];
        int medianIndex = ArrayMedian.getMedianIndexSubArray(array, startIndex, endIndex) - 1;//counting from 1
        int median = array[medianIndex];
        int indexBeforeMedian = startIndex;
        int indexAfterMedian = endIndex;

        for (int i = startIndex; i < endIndex + 1; i++) {
            if (array[i] < median) {
                partitionedArray[indexBeforeMedian] = array[i];
                indexBeforeMedian++;
            }
        }
        partitionedArray[indexBeforeMedian] = median;
        int pivot = indexBeforeMedian;//this is the new index of the median!!!
        for (int i = startIndex; i < endIndex + 1; i++) {
            if (i == medianIndex) {
                continue;
            }
            if (array[i] >= median) {
                partitionedArray[indexAfterMedian] = array[i];
                indexAfterMedian--;
            }
        }
        for (int i = startIndex; i < endIndex + 1; i++) {
            array[i] = partitionedArray[i];
        }

        return pivot;
    }
}
