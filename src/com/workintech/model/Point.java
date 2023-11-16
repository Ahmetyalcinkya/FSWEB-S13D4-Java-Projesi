package com.workintech.model;

public class Point {

    private int x ;
    private int y ;

    //constructor
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getter / setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //distance

    public double distance(){
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
    }

    public double distance(Point point){
        if(point == null) {
            new Point(0, 0);
            return distance();
        }
        return distance(point.getX(), point.getY());
    }

    public double distance(int pointX, int pointY){
        return Math.sqrt(Math.pow(this.x - pointX, 2) + Math.pow(this.y - pointY, 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
