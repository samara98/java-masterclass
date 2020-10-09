package com.wallarea;

public class Wall {
    private double height;
    private double width;

    public Wall() {
        setWidth(0);
        setHeight(0);
    }

    public Wall(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return (height * width);
    }
}
