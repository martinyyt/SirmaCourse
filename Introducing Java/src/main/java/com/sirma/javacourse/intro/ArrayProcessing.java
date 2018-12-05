package com.sirma.javacourse.intro;

public class ArrayProcessing {

    //returns the index of the smallest element; if the array is empty returns -1
    public static int getMinElementIndex(int[] array) {
        if (array.length == 0) {
            return -1;
        }
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //returns the sum of the elements of an array
    public static long sum(int[] array) {
        long sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public static void print(int[] array) {
        for (int number : array) {
            System.out.print(number + " / ");
        }
        System.out.println();
    }

    public static void print(long[] array) {
        for (long number : array) {
            System.out.print(number + " / ");
        }
        System.out.println();
    }

    // ? only return the sum or should I print the sub array and the sum???
    public static long findMaxSumOfConsecutiveElements(int[] array) {
        long maxSum = array[0];
        long tempSum;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int[] sum = new int[array.length - i];
            sum[0] = array[i];
            tempSum = sum[0];
            int tempStartIndex = 0;
            int tempEndIndex = 0;

            for (int j = 1; j < sum.length; j++) {
                sum[j] = sum[j - 1] + array[j + i];
                if (sum[j] >= tempSum) {
                    tempSum = sum[j];
                    tempStartIndex = i;
                    tempEndIndex = i + j;
                }
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                startIndex = tempStartIndex;
                endIndex = tempEndIndex;
            }
        }
        int[] result = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            result[i - startIndex] = array[i];
        }
        print(result);
        System.out.println(maxSum);
        return maxSum;
    }
}
