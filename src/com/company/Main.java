/*
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 *  Module 2 Task 2
 *  Inheritance
 *  1. Create a child  from the class Rectangle.
 *  2. Create another class as a super class for your one.  Or create a daughterly class for your one.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        // TESTING

        // Creating object of Rectangle

        Rectangle myRectangle = new Rectangle(3, 4);
        System.out.println(myRectangle.toString() + "\n");

        // Creating object of Computer Monitor

        ComputerMonitor SE2719HR = new ComputerMonitor("black", "Dell",
                75, 1920, 1080,
                16, 9);

        System.out.println(SE2719HR.toString() + "\n");

        // Creating object of Cube

        Cube myCube = new Cube (4);
        System.out.println(myCube.toString() + "\n");;

        // Creating object of Rubiks Cube

        RubiksCube myRubiksCube = new RubiksCube(50, 80, 9, "r b y g w o");
        System.out.println(myRubiksCube.toString());
    }
}

