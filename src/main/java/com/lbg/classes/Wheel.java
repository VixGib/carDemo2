package com.lbg.classes;

public class Wheel {

    private double angle;
    private double x_position;
    private double y_position;


    public Wheel(){

        this.angle = 0;
        this.x_position = 0;
        this.y_position = 0;
    }

    public Wheel(double x_position, double y_position){
        this.angle = 0;
        this.x_position = x_position;
        this.y_position = y_position;
    }



    public double distanceFrom(double x_position, double y_position){
        return Math.sqrt ((x_position - this.x_position) * (x_position - this.x_position) +
                (y_position - this.y_position) * (y_position - this.y_position));

    }

    public double distanceFrom(){
        return Math.sqrt ((this.x_position) * ( this.x_position) +
                (this.y_position) * (this.y_position));
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getX_position() {
        return x_position;
    }

    public void setX_position(double x_position) {
        this.x_position = x_position;
    }

    public double getY_position() {
        return y_position;
    }

    public void setY_position(double y_position) {
        this.y_position = y_position;
    }



}
