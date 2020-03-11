package com.cbt.utilities;

import java.util.List;

public class StringUtility {

    public static void verifyEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("TEST PASSED " + actual + " is equal to " + expected);
        } else {
            System.out.println("TEST FAILED " + actual + " is not equal to " + expected);
        }

    }

}



