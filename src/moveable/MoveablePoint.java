package com.oop.moveable;

import com.oop.moveable.Moveable;

public class MoveablePoint implements Moveable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "com.oop.moveable.MoveablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUp() {
        this.x += this.xSpeed;
    }

    @Override
    public void moveDown() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.y += this.ySpeed;
    }
}
