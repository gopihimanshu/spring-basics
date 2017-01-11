package com.allstate.models;

import java.util.List;

public class Graph {

    private int x;
    private int y;

    public Graph(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distance(List<Graph> coordinates){

        double x1 = coordinates.get(0).getX();
        double x2 = coordinates.get(1).getX();
        double y1 = coordinates.get(0).getY();
        double y2 = coordinates.get(1).getY();
        double dis = java.lang.Math.sqrt(Math.square((int) (x2-x1)) + Math.square((int)(y2-y1))) ;

        return  dis;
    }

    public static double slope(List<Graph> coordinates){

        double x1 = coordinates.get(0).getX();
        double x2 = coordinates.get(1).getX();
        double y1 = coordinates.get(0).getY();
        double y2 = coordinates.get(1).getY();

        double slope = (y2-y1)/(x2-x1);

        return  slope;
    }

    public static double yIntercept(List<Graph> coordinates){
        double x1 = coordinates.get(0).getX();
        double x2 = coordinates.get(1).getX();
        double y1 = coordinates.get(0).getY();
        double y2 = coordinates.get(1).getY();

        double yintercept = y2 - (slope(coordinates) * x2);
        return yintercept;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
