package com.oop.shape;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", true, 4.7);
//        System.out.println(s1);
//        System.out.println("Area is: " + s1.getArea());
//        System.out.println("Perimeter is: " + s1.getPerimeter());

        Circle c1 = (Circle)s1;
//        System.out.println(c1);
//        System.out.println("Area is: " + c1.getArea());
//        System.out.println("Perimeter is: " + c1.getPerimeter());

        Shape s3 = new Rectangle("BLUE", false, 4.5, 7.5);
//        System.out.println(s3);
//        System.out.println("Area is: " + s3.getArea());
//        System.out.println("Perimeter is: " + s3.getPerimeter());

        Rectangle r1 = (Rectangle)s3;
//        System.out.println(r1);
//        System.out.println("Area is: " + r1.getArea());
//        System.out.println("Perimeter is: " + r1.getPerimeter());

        Shape s4 = new Square(6.6);
//        System.out.println(s4);
//        System.out.println("Area is: " + s4.getArea());
//        System.out.println("Perimeter is: " + s4.getPerimeter());
//        System.out.println(((Square) s4).getWidth());

        Rectangle r2 = (Rectangle)s4;
//        System.out.println(r2);
//        System.out.println("Area is: " + r2.getArea());
//        System.out.println("Perimeter is: " + r2.getPerimeter());
//        System.out.println(r2.getColor());
//        System.out.println(r2.getWidth());
//        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println("Area is: " + r1.getArea());
        System.out.println("Perimeter is: " + r1.getPerimeter());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getWidth());
        System.out.println(sq1.getLength());
    }
}
