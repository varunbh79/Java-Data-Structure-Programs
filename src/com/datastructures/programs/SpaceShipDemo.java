package com.datastructures.programs;

import java.util.*;


public class SpaceShipDemo {

    public static void main (String[] args) {

        Map<Integer, String> spaceShips = new HashMap<> ();
        spaceShips.put ( 5, "Ghost" );
        spaceShips.put ( 40, "Death Star" );
        spaceShips.put ( 16, "B-wing" );
        spaceShips.put ( 4, "Starfighter" );
        List<Integer> list = new ArrayList<> ( spaceShips.keySet () );
        spaceShips.remove ( 40 );

        Random random = new Random ();

        Map<Integer, Integer> mapping = new LinkedHashMap<> ();
        for (Integer integer : list) {
            mapping.put ( integer, list.indexOf ( integer ) );
        }
        int index = mapping.get ( 40 );
        list.remove ( index );
        System.out.println ( list );
        for (Integer integer : list) {
            System.out.println ( spaceShips.get ( list.get ( mapping.get ( (integer) ) ) ) );
        }
        System.out.println ( list.get ( random.nextInt ( list.size () ) ) );
        System.out.println ( mapping );
    }
}
