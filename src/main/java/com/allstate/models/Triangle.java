package com.allstate.models;

import java.util.List;

public class Triangle {

    private int height;
    private int width;

    public Triangle() {
    }

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {return height;}
    public int getWidth() {return width;}


    public double getArea(){
        return this.height * this.width * 0.5;
    }

//    public static double area(List<Triangle> triangles)
//    {
//        double d1 = triangles.get(0).getArea();
//        double d2 = triangles.get(1).getArea();
//        return  d1+d2;
//    }

    public static double area(List<Triangle> triangles){
        return triangles.stream().map(a -> a.getArea()).reduce(0.0 ,(acc,elem) -> acc + elem );

    }

    public String toString() {
        return "Triangle{" +
                "height=" + this.height +
                ", width=" + this.width +
                '}';
    }
}
