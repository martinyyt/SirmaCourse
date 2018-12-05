package com.sirma.javacourse.intro;

public class ArrayReverse {

    public static void arrayReverse(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
    }
}
