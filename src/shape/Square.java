package com.oop.shape;

import com.oop.shape.Rectangle;

public class Square extends Rectangle {
    public Square() {

    }
    public Square(double side) {
        super(side, side);
    }
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }
}
