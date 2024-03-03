package model;

public class StadiumShape implements Containable{
    
public double x;
public double y; //upper left corner of bounding box
public int height; //width = 3 * height, diameter = height

public StadiumShape(double x, double y, int height){
    this.x = x;
    this.y = y;
    this.height = height;
}

public void translate( double dx, double dy){
    this.x += dx;
    this.y += dy;
}

@Override
public boolean contains(double px, double py) {
    double cradius = height/2;
    double c1x = this.x + height/2;
    double c1y = this.y + height/2;
    double c2x = this.x + height * 2.5;
    double c2y = this.y + height/2;
    double rwidth = height * 2;
    double rheight = height;
    double rx = this.x + height/2;
    double ry = this.y;

    //inside rectangle?
    if((rx <= px && px <= rx + rwidth)
     && (ry <= py && py <= ry+rheight)) return true;

     //inside left circle or not
     double distance = Math.sqrt((px - c1x) * (px - c1x) + (py-c1y) * (py-c1y));
     if (distance <= cradius) return true;

     //inside right circle
    distance = Math.sqrt((px - c2x) * (px - c2x) + (py-c2y) * (py-c2y));
     if (distance <= cradius) return true;


     return false;
}

}
