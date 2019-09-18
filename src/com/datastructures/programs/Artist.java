package com.datastructures.programs;


public class Artist {

    private Integer id;


    private Artist (Integer id) {
        this.id = id;
    }

    public static void main (String[] args) {

        Artist artist1 = new Artist ( 10 );
        Artist artist2 = new Artist ( 10 );
        System.out.println ( artist1.equals ( artist2 ) );
        System.out.println ( artist1.hashCode () + " " + artist2.hashCode () );
    }

    @Override
    public boolean equals (Object o) {
        if (o == null || !(o instanceof Artist)) return false;
        Artist artist = (Artist) o;
        return this.id.equals ( artist.id );
    }
}
