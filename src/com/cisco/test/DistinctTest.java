package com.cisco.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DistinctTest {

    public static void main (String[] args) {

        String[] strings = {"raj", "varun", "kai", "raju"};
        System.out.println ( checkDistinct ( strings ) );
    }

    private static boolean checkDistinct (String[] strings) {

        Set<String> stringSet = new HashSet<> ( Arrays.asList ( strings ) );
        return (stringSet.size () == strings.length);
    }
}
