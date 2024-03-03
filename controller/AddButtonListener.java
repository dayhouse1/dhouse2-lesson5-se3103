package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import model.Circle;
import model.Containable;
import model.Rect;
import model.StadiumShape;
import view.AppCanvas;
import view.AppWindow;

public class AddButtonListener implements ActionListener {

    private Random random = new Random();
    private final int size = AppWindow.SIZE;

    @Override
    public void actionPerformed(ActionEvent e) {
        int qty = App.model.addQty;
        for (int i = 0; i < qty; i++) {
            int x = random.nextInt(AppCanvas.WIDTH - size);
            int y = random.nextInt(AppCanvas.HEIGHT - size);
            Containable shape;
            String shapeType = App.model.shapeType;
            if (shapeType == AppWindow.shapeActionCommand[0]) {
                shape = new Circle(x, y, size / 2);
            } else if (shapeType.equals(AppWindow.shapeActionCommand[1])) {
                shape = new Rect(x, y, size, size);
            } else if (shapeType.equals(AppWindow.shapeActionCommand[2])) {
                shape = new StadiumShape(x, y, size);
            } else {
                assert false : "Unknown Shape to add";
                return;
            }
            App.model.shapes.add(shape);
        }
        App.win.repaintCanvas();
    }
}
