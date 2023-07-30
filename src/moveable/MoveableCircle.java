package com.oop.moveable;

import com.oop.moveable.Moveable;

public class MoveableCircle implements Moveable {
    public double radius;
    public MoveablePoint center;

    public MoveableCircle(double radius, MoveablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "com.oop.moveable.MoveableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}
