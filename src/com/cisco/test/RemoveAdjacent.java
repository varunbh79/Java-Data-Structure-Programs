package com.cisco.test;


public class RemoveAdjacent {

    // Complete the alternatingCharacters function below.
    private static int alternatingCharacters (String s) {
        int counter = 0;
        String temp = "";
        for (int i = 0; i < s.length () - 1; i++) {
            if (s.charAt ( i ) == s.charAt ( i + 1 )) {
                counter++;
            }

        }
        return counter;
    }


    public static void main (String[] args) {


        String input = "AAABBB";
        System.out.println ( alternatingCharacters ( input ) );
    }
}
