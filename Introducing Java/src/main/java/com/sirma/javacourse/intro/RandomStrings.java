package com.sirma.javacourse.intro;

import java.util.Random;

public class RandomStrings {

    static Random random = new Random();
    private static final int DIGITS_COUNT = 10;
    private static final int DIGITS_START_ASCII = 48;
    private static final int UPPERCASE_COUNT = 26;
    private static final int UPPERCASE_START_ASCII = 65;
    private static final int LOWERCASE_COUNT = 26;
    private static final int LOWERCASE_START_ASCII = 97;

    //ASCII digits [48-57]; ASCII capital letters [65-90] ASCII small letters [97-122]
    public static String randomString(int length) {
        StringBuilder randomStr = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int range = random.nextInt(3);
            switch (range) {
                case 0:
                    int digitASCII = random.nextInt(Integer.MAX_VALUE)%DIGITS_COUNT + DIGITS_START_ASCII;
                    randomStr.append((char)digitASCII);
                    break;
                case 1:
                    int uppercaseASCII = random.nextInt(Integer.MAX_VALUE)%UPPERCASE_COUNT + UPPERCASE_START_ASCII;
                    randomStr.append((char)uppercaseASCII);
                    break;
                case 2:
                    int lowercaseASCII = random.nextInt(Integer.MAX_VALUE)%LOWERCASE_COUNT + LOWERCASE_START_ASCII;
                    randomStr.append((char)lowercaseASCII);
                    break;
            }
        }

        return randomStr.toString();
    }
}
