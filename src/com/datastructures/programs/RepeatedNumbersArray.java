package com.datastructures.programs;

import java.util.*;


public class RepeatedNumbersArray {
    public static void main (String[] args) {


        Integer[] arr = {0, 1, 2, 120, 1, 0, 3, 4, 3, 5, 5, 4, 1, 2, 133, 120, 120, 120, 0, 0, 0, 133, 145, 166, 129};
        List<Integer> duplicates = computeDuplicatesInArray ( arr );
        System.out.println ( duplicates );
    }

    private static List<Integer> computeDuplicatesInArray (Integer[] arr) {

        List<Integer> input = Arrays.asList ( arr );
        if (input.isEmpty () || input.size () == 0)
            return null;
        List<Integer> resultant = new ArrayList<> ();
        Collections.sort ( input );
        for (int i = 0; i < input.size () - 1; i++) {
            if (input.get ( i ).equals ( input.get ( i + 1 ) )) {
                resultant.add ( input.get ( i ) );
                i = input.lastIndexOf ( input.get ( i ) );
            }
        }

        Collections.sort ( resultant, Comparator.reverseOrder () );
        return resultant;
    }
}
