package com.cisco.test;

import java.util.*;


public class KthFrequencyString {

    public static void main (String[] args) {

        String[] strings = {"a", "a", "b"};
        int k = 1;
        System.out.println ( computeKFrequnecy ( strings, k ) );
    }

    private static String computeKFrequnecy (String[] strings, int k) {

        Map<String, Integer> integerMap = new HashMap<> ();
        for (String s : strings) {
            Integer j = integerMap.get ( s );
            if (j == null) j = 0;
            integerMap.put ( s, ++j );
        }
        List<Map.Entry> entryList = new ArrayList<> ( integerMap.entrySet () );
        Collections.sort ( entryList, (o1, o2) -> {

            Integer v1 = (Integer) o1.getValue ();
            Integer v2 = (Integer) o2.getValue ();
            return v1.compareTo ( v2 );
        } );

        if (entryList.size () > k)
            return (String) (entryList.get ( k )).getKey ();
        return null;
    }
}
