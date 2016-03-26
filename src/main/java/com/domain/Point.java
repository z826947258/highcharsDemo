package com.domain;

/**
 * Created by zhang on 2016/3/26.
 */
public class Point {
    private double x;
    private double y;
    private String id;

    public Point() {
    }

    public Point(double x, double y , String id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
