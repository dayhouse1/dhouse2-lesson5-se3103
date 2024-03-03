package model;

public abstract class MyShape extends Object implements Containable {
    
    public double x;
    public double y;

    public MyShape(double x, double y){
        this.x = x;
        this. y = y;
    }

    public void translate(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public abstract double getArea();
    @Override
    public String toString(){
        return String.format("MyShape@[%.1f, %.1f]", x,y);
    }
}