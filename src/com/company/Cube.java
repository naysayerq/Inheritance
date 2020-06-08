/*
 * Classname Cube
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

import java.util.Objects;

public class Cube {

    // Parameters

    private int side;


    // Constructors
    // Constructor FULL

    public Cube(int side) {
        this.side = side;
    }

    // Constructor EMPTY

    public Cube() {
    }

    // Getters & Setters:

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Creating five methods:

    // First - Area

    public int getArea() {
        return (this.getSide() * this.getSide());
    }

    // Seconds - Volume

    public int getVolume() {
        return (this.getSide() * this.getSide() * this.getSide());
    }

    // Third - Diagonal

    public double getDiagonal() {
        return (Math.sqrt(2) * this.getSide());
    }

    // Fourth - Angle between faces of a cube

    public double getAngleBetweenFaces() {
        return (Math.PI / 2);
    }

    // Fifth - Radius of the described sphere

    public double getRadiusOfTheDescribedSphere() {
        return ((Math.sqrt(3) / 2) * this.getSide());
    }

    // toString() method:

    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + getArea() +
                ", volume=" + getVolume() +
                ", diagonal=" + getDiagonal() +
                ", angle between faces of a cube="
                + getAngleBetweenFaces() +
                ", radius of the described sphere="
                + getRadiusOfTheDescribedSphere()
                + "}";
    }

    // hash() and equals() methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return getSide() == cube.getSide();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}
