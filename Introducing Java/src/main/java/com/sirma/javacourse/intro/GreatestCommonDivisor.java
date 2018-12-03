package com.sirma.javacourse.intro;

public class GreatestCommonDivisor {

    /// using Euclid's algorithm for Greatest common divisor
    public static int findGCD(int numbOne, int numbTwo) {
        int remainder = 0;
        while (numbOne != numbTwo) {
            if (numbOne > numbTwo) {
                if (numbOne % numbTwo == 0) {
                    return numbTwo;
                }
                numbOne = numbOne % numbTwo;
            } else {
                if (numbTwo % numbOne == 0) {
                    return numbOne;
                }
                numbTwo = numbTwo % numbOne;
            }
        }
        return numbOne;
    }

    /// using formula LCM(a,b) = (a*b)/GCD(a,b)
    public static int findLCM(int numOne, int numbTwo) {
        int result = (numOne * numbTwo) / findGCD(numOne, numbTwo);
        return result;
    }
}
