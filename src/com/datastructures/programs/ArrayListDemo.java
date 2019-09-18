package com.datastructures.programs;

import java.util.ArrayList;
import java.util.List;


class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee (String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}


public class ArrayListDemo {

    public static void main (String[] args) {
        List<Employee> employeeList = new ArrayList<> ();
        employeeList.add ( new Employee ( "Raj", "Guru", 100 ) );
        employeeList.add ( new Employee ( "Dumsu", "Don", 101 ) );
        employeeList.add ( new Employee ( "Mark", "Riley", 102 ) );
        employeeList.set ( 2, new Employee ( "Lark", "timex", 220 ) );
        employeeList.add ( 1, new Employee ( "Zaxk", "Tyler", 190 ) );
        // employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employees = employeeList.toArray ( new Employee[employeeList.size ()] );
        for (Employee employee : employees) {
            System.out.println ( employee );
        }
    }
}
