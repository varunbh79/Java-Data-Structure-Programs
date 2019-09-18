package com.datastructures.programs;

import java.util.HashMap;
import java.util.Map;


public class AnagramComparisonByMap {

    public static void main (String[] args) {

        String s1 = "geeksforgeeks";
        String s2 = "keegskeegsrof";
        isAnagram ( s1, s2 );

    }


    private static void isAnagram (String input1, String input2) {
        if (computeAnagram ( input1, input2 )) {
            System.out.println ( "Strings are anagram to each other" );
        } else
            System.out.println ( "Strings are not anagram" );
    }

    private static Boolean computeAnagram (String str1, String str2) {

        if (str1.length () != str2.length ()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<> ();
        Map<Character, Integer> map2 = new HashMap<> ();
        char[] arr1 = str1.toCharArray ();
        char[] arr2 = str2.toCharArray ();
        for (char character : arr1) {
            map1.merge ( character, 1, Integer::sum );
        }

        for (char c : arr2) {
            map2.merge ( c, 1, Integer::sum );
        }

        return map1.equals ( map2 );

    }
}
