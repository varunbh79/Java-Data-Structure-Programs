package com.cisco.test;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;


class Maths {

    /*
     * Complete the 'rollTheString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY roll
     */

    static String rollTheString (String s, List<Integer> roll) {
        // Write your code here
        s = s.replaceAll ( "[0-9]+", "" );
        char[] chars = s.toCharArray ();

        for (int i = 0; i < roll.size (); i++) {
            int op = roll.get ( i );
            for (int j = 0; j < chars.length; j++) {
                if (j < op) {
                    if (chars[j] >= 'a' && chars[j] <= 'z') {
                        if (chars[j] == 'z') {
                            chars[j] -= 25;
                        } else {
                            chars[j] += 1;
                        }
                    }
                }
            }

        }
        return String.valueOf ( chars );
    }
}

public class StringS {
    public static void main (String[] args) throws IOException {

        String input = "12345";
        String result = Maths.rollTheString ( input, Arrays.asList ( 1 ) );
        System.out.println ( result );

    }
}

