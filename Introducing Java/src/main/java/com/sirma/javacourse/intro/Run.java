package com.sirma.javacourse.intro;

public class Run {
    public static void main(String[] args) {
        /*System.out.println(findGCD(10, 1112));
        System.out.println(findLCM(20, 1112));
        System.out.println(getMinElementIndex(new int[]{-55, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100}));
        System.out.println(sum(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100}));
        print(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, 100});
        findMaxSumOfConsecutiveElements(new int[]{5, 2, 6, 8, 3, 5, -1, 5, 2, 1, -6, 5, -100});
        findMaxSumOfConsecutiveElements(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        getMedianIndex(new int[]{1, 2, 3, 4, 5});
        getMedianIndex(new int[]{4, 5, 99, -1, 5, 6});
        getMedianIndex(new int[]{1});*/
        /*int[] arr1 = new int[]{-10, 1, 2, -1, 2, 3, 5, 5, 5, 6};
        ArraySorting.partitionSubArray(arr1, 1, 4);*/

        //int[] arr = new int[]{5, 9, 33, 47, 9, -5, 8, -63, 546, 8, 2, 1, -1, 65848, -38489,
        //        2, 8, 6, 3, 4, -52894, 9, -0, 99, -1568, 1};
        //ArraySorting.quickSort(arr);
        //ArrayReverse.arrayReverse(arr);
        //ArrayProcessing.print(arr);
        SummingLargeNumbers.sumLargeNumbers("5525","2566");
        System.out.println(RandomStrings.randomString(2000));
        for (int i = 0; i<100;i++){
            System.out.println(RandomStrings.randomString(1));
        }

    }
}
