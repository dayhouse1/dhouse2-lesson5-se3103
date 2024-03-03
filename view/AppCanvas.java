package view;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


import controller.App;
import model.Circle;
import model.Rect;
import model.StadiumShape;

public class AppCanvas extends JPanel{

    public static int WIDTH = 500;
    public static int HEIGHT = 500;


    Color circleColor = Color.MAGENTA;
    Color rectColor = Color.GREEN;
    

public AppCanvas(){
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
}

@Override
public void paintComponent(Graphics g){
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    BasicStroke stroke = new BasicStroke(2);
    g2.setStroke(stroke);
    for(int i = 0; i < App.model.shapes.size(); i++){
        Object shape = App.model.shapes.get(i);
        if(shape instanceof Circle)
            drawCircle(g2, (Circle) shape, i == App.model.selectedIndex);
        else if(shape instanceof Rect)
            drawRect(g2, (Rect) shape, i == App.model.selectedIndex);
        else if (shape instanceof StadiumShape)
            drawStadiumShape(g2, (StadiumShape) shape, i == App.model.selectedIndex);

    }
}

private void drawCircle(Graphics2D g2, Circle c, boolean isFill){
    double r = c.radius;
    Ellipse2D.Double s = new Ellipse2D.Double(c.x - r, c.y - r, r *2, r * 2 );
    g2.setColor(circleColor);
    if (isFill) g2.fill(s);
    else g2.draw(s);

}

private void drawRect(Graphics2D g2, Rect r, boolean isFill){
    Rectangle.Double s = new Rectangle.Double(r.x - r.width/2, r.y- r.height/2,r.width,r.height);
    g2.setColor(rectColor);
    if(isFill) g2.fill(s);
    else g2.draw(s);
}

private void drawStadiumShape (Graphics2D g2, StadiumShape s, boolean isFill){
    int x = (int) s.x;
    int y = (int) s.y;
    BufferedImage image;
    if (isFill) image = ImageStore.stadiumImageSelected;
    else image = ImageStore.stadiumImage;
    g2.drawImage(image, null, x, y);

}


}
