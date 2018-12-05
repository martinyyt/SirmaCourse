package com.sirma.javacourse.intro;

public class SummingLargeNumbers {

    public static String sumLargeNumbers(String numbOne, String numbTwo) {
        if (numbOne.length()==0&&numbTwo.length()==0){
            return "0";
        }
        StringBuilder sum = new StringBuilder();
        StringBuilder firstNumb = new StringBuilder(numbOne);
        StringBuilder secondNumb = new StringBuilder(numbTwo);
        int remainder = 0;
        //adding '0' in front of the shorter number, so both have equal length
        int diffInLength = firstNumb.length() - secondNumb.length();
        if (diffInLength > 0) {
            for (int i = 0; i < diffInLength; i++) {
                secondNumb.insert(0, '0');
            }
        } else {
            for (int i = 0; i < Math.abs(diffInLength); i++) {
                firstNumb.insert(0, '0');
            }
        }
        for (int i = firstNumb.length() - 1; i >= 0; i--) {
            int numbToInsert = Character.getNumericValue(firstNumb.charAt(i)) +
                    Character.getNumericValue(secondNumb.charAt(i)) + remainder;
            remainder = numbToInsert / 10;
            numbToInsert %= 10;
            sum.insert(0, numbToInsert);
        }
        return sum.toString();
    }
}
