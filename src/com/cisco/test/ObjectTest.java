package com.cisco.test;

import java.io.*;


class Car implements Serializable {

    static String mode = "cool";
    private String name;
    private String type;

    public Car (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName () {
        return name;
    }

    public String getType () {
        return type;
    }
}


class ObjectTest {


    public static void main (String[] args) throws IOException, ClassNotFoundException {

        Car car = new Car ( "Audi", "4*4" );
        FileOutputStream fileOutputStream = new FileOutputStream ( "D:\\demoserial.txt" );
        ObjectOutputStream outputStream = new ObjectOutputStream ( fileOutputStream );
        outputStream.writeObject ( car );
        FileInputStream fileInputStream = new FileInputStream ( "D:\\demoserial.txt" );
        ObjectInputStream inputStream = new ObjectInputStream ( fileInputStream );
        Car res = (Car) inputStream.readObject ();
        System.out.println ( res.getName () + res.getType () + Car.mode );
    }
}


